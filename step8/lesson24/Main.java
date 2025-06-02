public class Main {
    public static void main(String[] args) {
        Player player = new Player(10, 100);
        Caretaker caretaker = new Caretaker();

        player.showStatus();  // Level=10, HP=100
        caretaker.save(player, "Before Boss Fight", "ボスせんぜんのセーブデータ");

        player.fight();
        player.showStatus();  // Level=11, HP=80
        caretaker.save(player, "Mid Battle", "たたかいなかばのセーブ");

        player.fight();
        player.showStatus();  // Level=12, HP=60
        // ここではまだセーブしない

        System.out.println("Oops, let's load the previous state!");
        caretaker.load(player);  // Undo to "Mid Battle"
        player.showStatus();     // Level=11, HP=80

        System.out.println("Let's load the 'Before Boss Fight' state!");
        caretaker.load(player);  // Undo to "Before Boss Fight"
        player.showStatus();     // Level=10, HP=100
    }
}
