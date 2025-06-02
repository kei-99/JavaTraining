public class User extends Participant {
    public User(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String message) {
        if (!active) return;
        System.out.println("[" + name + "] received message: \"" + message + "\"");
    }
}
