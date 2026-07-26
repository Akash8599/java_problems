package solidprinciples.dependecnyInversion;

public class EmaplService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sended: " + message);
    }
}
