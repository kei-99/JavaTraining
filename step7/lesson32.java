import java.util.LinkedList;
import java.util.Queue;

public class lesson32 {
    public static void main(String[] args) {
        // LinkedListを使ってQueueを作成（Queueインターフェース型で扱う）
        Queue<Integer> queue = new LinkedList<>();

        // 1から5までの整数を指定の順序でキューに追加（エンキュー）
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // キューの内容を表示
        System.out.println("キューの内容: " + queue);
    }
}
