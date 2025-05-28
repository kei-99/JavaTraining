import java.util.LinkedList;
import java.util.Queue;

public class lesson34 {
    public static void main(String[] args) {
        // 課題33の操作後のQueueを準備
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Queueの先頭要素を取り除かずに確認（peekまたはelement）
        int headValue = queue.peek();  // または queue.element();

        // 確認した値を表示
        System.out.println("Queueの先頭の要素: " + headValue); // 2

        // Queueの内容を表示（変わっていないことを確認）
        System.out.println("操作後のQueueの内容: " + queue);
    }
}
