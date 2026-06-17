/**
 * A concrete implementation of the NotificationMedium interface that 
 * simulates sending notifications via WhatsApp.
 * 
 * This class serves as an interchangeable plug-in channel that can 
 * be dynamically injected into the AlertSystem via composition.
 * 
 * @author Camelia 
 * @version 1.0
 */

public class WhatsAppService  implements NotificationMedium {

    /**
     * Sends a message using the WhatsAppService notification channel.
     * 
     * @param message the message to be delivered to the user
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
 