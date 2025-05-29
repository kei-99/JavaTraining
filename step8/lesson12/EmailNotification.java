// メールで通知（つうち）するクラス
public class EmailNotification extends Notification {
    public EmailNotification(NotificationPlatform platform) {
        // 親（おや）クラスのコンストラクタを呼（よ）び出（だ）す
        super(platform);
    }

    @Override
    public void notify(String message) {
        // メールとして送信（そうしん）する
        System.out.print("Sending Email ");
        platform.send(message); // 実装部（じっそうぶ）に処理（しょり）を委任（いにん）
    }
}
