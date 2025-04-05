abstract class Notification {
    abstract void send(String to, String message);
}

class Email extends Notification {
    @Override
    void send(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}

class SMS extends Notification {
    @Override
    void send(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification email = new Email();
        Notification sms = new SMS();
        
        email.send("user@example.com", "Hello via Email");
        sms.send("+123456789", "Hello via SMS");
    }
}