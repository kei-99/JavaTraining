public interface ChatRoomMediator {
    void registerUser(Participant user);
    void sendMessage(String message, Participant sender);
    void sendMessage(String message, Participant sender, Participant receiver);  // プライベートメッセージ用
    void kickUser(Participant admin, Participant user);  // ユーザー追放用
}
