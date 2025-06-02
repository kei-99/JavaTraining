public class Player {
    private int level; // レベル
    private int hp;    // HP（体力）

    public Player(int level, int hp) {
        this.level = level;
        this.hp = hp;
    }

    // げんざいのじょうたいをひょうじ（テストよう）
    public void showStatus() {
        System.out.println("[Player] Level=" + level + ", HP=" + hp);
    }

    // げんざいのじょうたいをほぞん（メメントさくせい）
    public PlayerMemento save(String label, String comment) {
        return new PlayerMemento(level, hp, label, comment);
    }

    // メメントからじょうたいをふくげん
    public void load(PlayerMemento memento) {
        this.level = memento.getLevel();
        this.hp = memento.getHp();
    }

    // せんとうしてレベルアップ、HPげんしょうをさいげんするメソッド
    public void fight() {
        level += 1;  // レベルがあがる
        hp -= 20;    // せんとうでHPがへる
    }
}
