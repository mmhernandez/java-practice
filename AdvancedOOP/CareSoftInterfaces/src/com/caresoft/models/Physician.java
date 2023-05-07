package com.caresoft.models;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;

//	CONSTRUCTOR
	public Physician(Integer id) {
		super(id);
	}

//	GETTERS
	public ArrayList<String> getPatientNotes() {
		return this.patientNotes;
	}
	
	
//	SETTERS
	
	
//	INSTANCE METHODS
	@Override
	public boolean assignPin(int pin) {
		String pinString = Integer.toString(pin);
    	if(pinString.length() == 4) {
    		super.setPin(pin);
    		return true;
    		
    	} else {
    		return false;
    	}
    }
	
	@Override
	public boolean accessAuthorized(Integer id) {
		if(id == super.id ) {
			return true;
		}
		return false;
	}
	
//	OTHER METHODS
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

}
