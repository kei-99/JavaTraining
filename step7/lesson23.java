import java.util.HashMap;
import java.util.Map;

public class lesson23 {
    public static void main(String[] args) {
        // ① HashMapを作成し、名前と年齢を格納
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 22);

        // ② "Taro" を削除
        map.remove("Taro");

        // ③ HashMap の中身をすべて表示
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " の年齢は " + entry.getValue() + " 歳です。");
        }
    }
}
