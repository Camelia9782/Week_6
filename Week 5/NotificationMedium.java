
/**
 * Defines the behavior required for any notification delivery mechanism.
 * 
 * @author Camelia
 * @version 1.0
 */
public interface NotificationMedium {
    /**
     * Sends a notification message through the specific medium channel.
     * 
     * @param message The text content of the notification to be sent.
     */
    void send(String message);
   
}
