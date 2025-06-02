public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    // 管理者用：ユーザー追放コマンド
    public void kickUser(Participant user) {
        if (!isActive()) {
            System.out.println("[" + name + "] can no longer send or receive messages.");
            return;
        }
        System.out.println("[" + name + "] → ChatRoom: \"Kick user " + user.getName() + " for spamming.\"");
        mediator.kickUser(this, user);
    }
}
