package com.caresoft.models;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.HIPAACompliantAdmin;
import com.caresoft.clinicapp.HIPAACompliantUser;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

	private String role;
    private ArrayList<String> securityIncidents;
    
    
//	CONSTRUCTOR
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.role = role;
    	this.securityIncidents = new ArrayList<String>();
    }

    
//	GETTERS
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
//	SETTERS
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	

	//	INSTANCE METHODS
	@Override
	public boolean assignPin(int pin) {
		String pinString = Integer.toString(pin);
    	if(pinString.length() == 6) {
    		super.setPin(pin);
    		return true;
    		
    	} else {
    		return false;
    	}
    }
	
	@Override
	public boolean accessAuthorized(Integer id) {
		if(this.id ==  id) {
			return true;
		} else {
			authIncident();
			return false;
		}
	}
	
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}
	
	
//	OTHER METHODS
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
    		String report = String.format(
    				"Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
    				new Date(), this.id, 
    				"AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }
}
