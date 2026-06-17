import java.util.ArrayList;

/**
 * The central system responsible for delivering notifications using 
 * a chosen NotificationMedium implementation (Email, SMS, etc.).
 * 
 * This class demonstrates composition by holding a reference to a 
 * NotificationMedium object, which can be swapped at runtime.
 * 
 * It also maintains a log of all messages sent during the session
 * using an ArrayList.
 * 
 * @author Camelia
 * @version 1.0
 */
public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> log;

    /**
     * Constructs a new AlertSystem with an empty message log.
     */
    public AlertSystem() {
        this.log = new ArrayList<>();
    }

    /**
     * Sets the active notification medium (Email, SMS, etc.).
     * 
     * @param medium the NotificationMedium implementation to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }
    
    /**
     * Sends a notification using the currently selected medium and
     * records the message in the log.
     * 
     * @param message the message to send to the user
     */
    public void notifyUser(String message) {
        if (medium == null) {
            System.out.println("Error: No notification medium selected.");
            return;
        }

        medium.send(message);
        log.add(message);
    }
    
    /**
     * Prints all messages stored in the log.
     */
    public void printLog() {
        System.out.println("\n--- Notification Log ---");
        for (String entry : log) {
            System.out.println(entry);
        }
    }

    /**
     * CLI entry point for testing the AlertSystem.
     * 
     * @param args Command line execution arguments
     */
    public static void main(String[] args) {
        AlertSystem system = new AlertSystem();

        // Start with Email
        system.setMedium(new EmailService());
        system.notifyUser("Welcome to the system!");
        system.notifyUser("Your account has been created.");

        // Switch to SMS
        system.setMedium(new SMSService());
        system.notifyUser("Your verification code is 24681");

        //Switch to WhatsApp
        system.setMedium(new WhatsAppService());
        system.notifyUser("You have activated your WhatsApp alerts");


        //Print log
        system.printLog();
    }
}