package solidprinciples.open_closed.notification;

//PROBLEM
//
//public class NotificationSender {
//    public void send(String type, String message) {
//        if (type.equals("EMAIL")) {
//            System.out.println("Sending Email: " + message);
//        } else if (type.equals("SMS")) {
//            System.out.println("Sending SMS: " + message);
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new SmsNotification(), "Sms notification send .....");

        notificationService.sendNotification(new EmailNotification(), "Email notification send .....");

        notificationService.sendNotification(new WhatsappNotication(), "Whatsapp notification send .....");
    }
}


