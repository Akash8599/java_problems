package solidprinciples.open_closed.notification;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
