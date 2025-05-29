// SMSで通知（つうち）するクラス
public class SMSNotification extends Notification {
    public SMSNotification(NotificationPlatform platform) {
        // 親（おや）クラスのコンストラクタを呼（よ）び出（だ）す
        super(platform);
    }

    @Override
    public void notify(String message) {
        // SMSとして送信（そうしん）する
        System.out.print("Sending SMS ");
        platform.send(message); // 実装部（じっそうぶ）に処理（しょり）を委任（いにん）
    }
}
