import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {
    private List<Participant> participants = new ArrayList<>();

    @Override
    public void registerUser(Participant user) {
        participants.add(user);
        user.setMediator(this);
        System.out.println("[ChatRoom] User " + user.getName() + " joined the room.");
    }

    @Override
    public void sendMessage(String message, Participant sender) {
        if (!sender.isActive()) {
            System.out.println("[" + sender.getName() + "] can no longer send or receive messages.");
            return;
        }
        System.out.println("[ChatRoom] Broadcasting " + sender.getName() + "'s message to other users...");
        for (Participant p : participants) {
            if (p != sender && p.isActive()) {
                p.receiveMessage(message);
            }
        }
    }

    @Override
    public void sendMessage(String message, Participant sender, Participant receiver) {
        if (!sender.isActive()) {
            System.out.println("[" + sender.getName() + "] can no longer send or receive messages.");
            return;
        }
        if (!participants.contains(receiver) || !receiver.isActive()) {
            System.out.println("[ChatRoom] Cannot deliver private message to " + receiver.getName() + ". User not in room or inactive.");
            return;
        }
        // 受信者にのみ送信（プライベートメッセージ）
        System.out.println("[ChatRoom] Sending private message from " + sender.getName() + " to " + receiver.getName() + "...");
        receiver.receiveMessage("[Private] " + message);
    }

    @Override
    public void kickUser(Participant admin, Participant user) {
        if (!(admin instanceof Admin)) {
            System.out.println("Only admins can kick users.");
            return;
        }
        if (!participants.contains(user)) {
            System.out.println("[ChatRoom] User " + user.getName() + " is not in the room.");
            return;
        }
        participants.remove(user);
        user.deactivate();
        System.out.println("[ChatRoom] " + user.getName() + " was removed from the room.");
    }
}
