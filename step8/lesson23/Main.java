public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new User("Alice");
        User bob = new User("Bob");
        Admin admin = new Admin("Admin");

        chatRoom.registerUser(alice);
        chatRoom.registerUser(bob);
        chatRoom.registerUser(admin);

        // 通常メッセージ
        alice.sendMessage("Hello everyone!");
        bob.sendMessage("Hello Alice!");

        // プライベートメッセージ
        alice.sendMessage("Hey Bob, this is a private message.", bob);

        // 管理者による追放
        admin.kickUser(bob);

        // 追放されたユーザーのメッセージ送信テスト（失敗する）
        bob.sendMessage("Can I still send?");

        // 追放されたユーザーの受信テスト（失敗する）
        alice.sendMessage("Are you still there, Bob?");
    }
}
