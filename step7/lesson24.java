import java.util.HashMap;
import java.util.Map;

public class lesson24 {
    public static void main(String[] args) {
        // 元の HashMap<String, Integer> を作成
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Taro", 18);
        originalMap.put("Hanako", 20);
        originalMap.put("Jiro", 22);

        // キーと値を入れ替えた新しい HashMap<Integer, String> を作成
        HashMap<Integer, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }

        // 入れ替え後の HashMap の中身を表示
        for (Map.Entry<Integer, String> entry : reversedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
