import java.util.HashMap;

public class lesson22 {
    public static void main(String[] args) {
        // ① HashMapを作成し、キーと値を追加
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 22);

        // ② "Taro" を削除
        map.remove("Taro");

        // ③ 残っている要素をすべて表示
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " の年齢は " + entry.getValue() + " 歳です。");
        }
    }
}
