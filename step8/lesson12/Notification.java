// 通知方法（つうちほうほう）の抽象（ちゅうしょう）クラス（Abstraction）
public abstract class Notification {
    // 通知対象（つうちたいしょう）のプラットフォーム（実装部（じっそうぶ））
    protected NotificationPlatform platform;

    // コンストラクタで通知対象（つうちたいしょう）を受（う）け取（と）る
    public Notification(NotificationPlatform platform) {
        this.platform = platform;
    }

    // 通知（つうち）を行（おこな）う抽象メソッド（ちゅうしょうメソッド）
    public abstract void notify(String message);
}
