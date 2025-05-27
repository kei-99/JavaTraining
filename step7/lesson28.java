import java.util.HashMap;
import java.util.Map;

public class lesson28 {
    public static void main(String[] args) {
        // map1を作成し、キーと値を登録
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        // map2を作成し、キーと値を登録
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 20);
        map2.put("C", 30);
        map2.put("D", 40);

        // map1にmap2の内容を結合（重複キーはmap2の値で上書き (うわがき)）
        map1.putAll(map2);

        // 結合後のmap1の全要素を表示
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println("キー: " + entry.getKey() + ", 値: " + entry.getValue());
        }
    }
}
