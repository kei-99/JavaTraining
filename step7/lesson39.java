import java.util.PriorityQueue;

// タスククラス：タスク名と優先度を持つ
class Task implements Comparable<Task> {
    private String name;   // タスク名（たすくめい）
    private int priority;  // 優先度（ゆうせんど）

    // コンストラクタ
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // 優先度で比較（小さいほど優先度高い）
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    // 表示用メソッド
    @Override
    public String toString() {
        return "Task(\"" + name + "\", 優先度: " + priority + ")";
    }
}

public class lesson39 {

    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>();

        // タスクを追加
        pq.add(new Task("レポート作成", 3));
        pq.add(new Task("緊急バグ修正", 1));
        pq.add(new Task("メールチェック", 5));
        pq.add(new Task("コードレビュー", 2));

        // 優先度順に取り出して表示
        while (!pq.isEmpty()) {
            Task task = pq.poll();
            System.out.println("処理中: " + task);
        }
    }
}
