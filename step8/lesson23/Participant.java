public abstract class Participant {
    protected ChatRoomMediator mediator;
    protected String name;
    protected boolean active = true;  // 追放されたかどうか

    public Participant(String name) {
        this.name = name;
    }

    public void setMediator(ChatRoomMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        active = false;
    }

    public abstract void receiveMessage(String message);

    public void sendMessage(String message) {
        if (!active) {
            System.out.println("[" + name + "] can no longer send or receive messages.");
            return;
        }
        System.out.println("[" + name + "] → ChatRoom: \"" + message + "\"");
        mediator.sendMessage(message, this);
    }

    // プライベートメッセージ用
    public void sendMessage(String message, Participant receiver) {
        if (!active) {
            System.out.println("[" + name + "] can no longer send or receive messages.");
            return;
        }
        System.out.println("[" + name + "] → ChatRoom (to " + receiver.getName() + "): \"" + message + "\"");
        mediator.sendMessage(message, this, receiver);
    }
}
