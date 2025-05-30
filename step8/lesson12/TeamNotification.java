public class TeamNotification implements NotificationPlatform {
    @Override
    public void send(String message) {
        System.out.println("to a Team: " + message);
    }
}
