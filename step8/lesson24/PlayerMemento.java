public class PlayerMemento {
    private final int level;   // レベル
    private final int hp;      // HP
    private final String label;   // セーブのラベル（なまえ）
    private final String comment; // セーブのメモ（こめんと）

    public PlayerMemento(int level, int hp, String label, String comment) {
        this.level = level;
        this.hp = hp;
        this.label = label;
        this.comment = comment;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getLabel() {
        return label;
    }

    public String getComment() {
        return comment;
    }
}
