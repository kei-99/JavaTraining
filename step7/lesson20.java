import java.util.HashMap;
import java.util.Map;

public class lesson20 {
    public static void main(String[] args) {
        // ① HashMap を作成
        HashMap<String, Integer> map = new HashMap<>();

        // ② 名前（キー）と年齢（値）を登録
        map.put("Alice", 20);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        // ③ 登録された全要素を表示（拡張for文＋entrySet）
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
