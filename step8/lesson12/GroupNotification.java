// グループへの通知（つうち）を実装（じっそう）するクラス
public class GroupNotification implements NotificationPlatform {
    @Override
    public void send(String message) {
        // グループ宛（あて）にメッセージを送信（そうしん）
        System.out.println("Sending to a Group: " + message);
    }
}
