package solidprinciples.open_closed.notification;

public class WhatsappNotication implements NotificationStrategy{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
