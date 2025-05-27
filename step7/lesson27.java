import java.util.Map;
import java.util.TreeMap;

public class lesson27 {
    public static void main(String[] args) {
        // TreeMap を作成（ID → 名前）
        TreeMap<Integer, String> map = new TreeMap<>();

        // データを追加
        map.put(1, "Taro");
        map.put(3, "Hanako");
        map.put(2, "Jiro");

        // 登録された内容を表示（キーの昇順で出力される）
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", 名前: " + entry.getValue());
        }
    }
}
