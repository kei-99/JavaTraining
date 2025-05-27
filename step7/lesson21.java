import java.util.HashMap;

public class lesson21 {
    public static void main(String[] args) {
        // ① HashMapを作成し、名前と年齢を登録
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 20);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        // ② 特定の名前を指定して年齢を取得
        String name = "Bob";
        Integer age = map.get(name);

        // ③ 取得した年齢を表示
        System.out.println(name + " の年齢は " + age + " 歳です。");
    }
}
