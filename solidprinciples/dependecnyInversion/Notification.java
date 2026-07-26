package solidprinciples.dependecnyInversion;

public class Notification {
    private MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notify(String message) {
        messageService.sendMessage(message);
    }
}
