package solidprinciples.open_closed.notification;

public class NotificationService {

    public void sendNotification(NotificationStrategy notificationStrategy, String message){
        notificationStrategy.send(message);
    }
}
