// クライアントコード：通知（つうち）方法と対象（たいしょう）を組（く）み合わせて使（つか）う
public class Main {
    public static void main(String[] args) {
        // メール通知（つうち）＋ 個人宛（こじんあて）
        Notification emailToPersonal = new EmailNotification(new PersonalNotification());
        emailToPersonal.notify("Hello, John!");

        // SMS通知（つうち）＋ グループ宛（あて）
        Notification smsToGroup = new SMSNotification(new GroupNotification());
        smsToGroup.notify("Meeting at 3 PM.");
    }
}
