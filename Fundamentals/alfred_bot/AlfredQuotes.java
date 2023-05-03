import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    public String guestGreeting(String name, boolean useDate) {
        Date date = new Date();
        SimpleDateFormat hoursMilitary = new SimpleDateFormat("k");
        String strHoursMilitary = hoursMilitary.format(date);
        
        Integer intHoursMilitary = Integer.valueOf(strHoursMilitary);
        String dayPeriod;
        if(intHoursMilitary >= 11 && intHoursMilitary <= 5) {
            dayPeriod = "Afternoon";
        }
        else if(intHoursMilitary < 11) {
            dayPeriod = "Morning";
        }
        else {
            dayPeriod = "Evening";
        }
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    public String guestGreeting(String dayPeriod, String name) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }

    public int provideRandomNumer() {
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        return randomNumber;
    }
}