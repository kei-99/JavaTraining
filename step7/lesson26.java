import java.util.HashMap;

public class lesson26 {
    public static void main(String[] args) {
        // HashMap を作成（名前 → 年齢）
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 25);

        // 特定の値（年齢）が存在するか確認
        int targetValue = 25;

        if (map.containsValue(targetValue)) {
            System.out.println(targetValue + " は値として存在します。");
        } else {
            System.out.println(targetValue + " は値として存在しません。");
        }
    }
}
