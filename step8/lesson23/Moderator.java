public class Moderator extends Participant {
    public Moderator(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("[MOD " + name + "] received: \"" + message + "\"");
    }

    public boolean isMessageAllowed(String message) {
        // 禁止語をチェック（例："badword" を禁止）
        return !message.toLowerCase().contains("badword");
    }
}
