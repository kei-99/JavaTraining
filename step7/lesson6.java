import java.util.LinkedList;

public class lesson6 {
    public static void main(String[] args) {
        // 1. LinkedListを作成して "A"〜"E" を追加
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // 2. インデックス1に "X" を追加（A, X, B, C, D, E）
        list.add(1, "X");

        // 3. インデックス3の要素（"C"）を削除（A, X, B, D, E）
        list.remove(3);

        // 4.forEach メソッドで最終的に残った要素を表示
        list.forEach(item -> System.out.println(item));
    }
}
