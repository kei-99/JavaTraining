// 個人（こじん）への通知（つうち）を実装（じっそう）するクラス
public class PersonalNotification implements NotificationPlatform {
    @Override
    public void send(String message) {
        // 個人宛（こじんあて）にメッセージを送信（そうしん）
        System.out.println("Sending to a Personal Recipient: " + message);
    }
}
