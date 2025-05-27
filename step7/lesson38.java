import java.util.LinkedList;
import java.util.Queue;
//  Circular Buffer (ring buffer) 
public class lesson38<T> {

    private Queue<T> queue;      // キュー（バッファ本体）
    private int maxSize;         // 最大サイズ（さいだいサイズ）

    // コンストラクタ（最大サイズを指定）
    public lesson38(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    // 要素（ようそ）を追加（ついか）するメソッド
    public void addElement(T element) {
        // もし満杯（まんぱい）なら、poll() や remove() で**先頭（せんとう）**の要素を削除（さくじょ）します。
        if (queue.size() == maxSize) {
            T removed = queue.poll();
            System.out.println("バッファ満杯のため、古い要素を削除: " + removed);
        }
        queue.offer(element);  // 新しい要素を追加
        printBuffer();
    }

    // 現在のバッファ内容（ないよう）を表示（ひょうじ）
    public void printBuffer() {
        System.out.println("バッファの中身: " + queue);
    }

    // 動作テスト用 main メソッド
    public static void main(String[] args) {
        lesson38<Integer> buffer = new lesson38<>(3);

        buffer.addElement(1);  // [1]
        buffer.addElement(2);  // [1, 2]
        buffer.addElement(3);  // [1, 2, 3]
        buffer.addElement(4);  // 古い1削除 -> [2, 3, 4]
        buffer.addElement(5);  // 古い2削除 -> [3, 4, 5]
    }
}
