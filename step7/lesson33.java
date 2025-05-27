import java.util.LinkedList;
import java.util.Queue;

public class lesson33 {
    public static void main(String[] args) {
        // 課題32で作成したQueueを準備
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // 先頭の要素を1つ取り出す（デキュー）
        int removedValue = queue.remove(); // または queue.poll();

        // 取り出した値を表示
        System.out.println("取り出した値: " + removedValue);

        // デキュー後のQueueの内容を表示
        System.out.println("デキュー後のキューの内容: " + queue);
    }
}
