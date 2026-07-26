package solidprinciples.dependecnyInversion;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {

        MessageService emaplService = new EmaplService();
        Notification notification = new Notification(emaplService);
        notification.notify("AKASH");
    }
}


