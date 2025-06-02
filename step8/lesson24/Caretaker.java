import java.util.Stack;

public class Caretaker {
    private Stack<PlayerMemento> history = new Stack<>();

    // セーブ（げんざいのじょうたいをスタックにほぞん）
    public void save(Player player, String label, String comment) {
        history.push(player.save(label, comment));
        System.out.println("Saving the current state... (Label: \"" + label + "\")");
    }

    // ロード（Undoのようにさいふくげん）
    public void load(Player player) {
        if (!history.isEmpty()) {
            PlayerMemento memento = history.pop();
            System.out.println("Restoring the state labeled: \"" + memento.getLabel() + "\"");
            player.load(memento);
        } else {
            System.out.println("No more saved states!");
        }
    }
}
