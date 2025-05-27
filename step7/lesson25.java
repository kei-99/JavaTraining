import java.util.HashMap; // HashMap クラスを使うためのインポート

public class lesson25 {
    public static void main(String[] args) {
        // HashMap を作成する。キーは String（名前）、値は Integer（年齢）
        HashMap<String, Integer> map = new HashMap<>();

        // データを格納する（名前 → 年齢）
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 22);

        // 存在を確認したいキー（名前）を指定する
        String keyToCheck = "Hanako";

        // containsKey メソッドを使ってキーが存在するか確認する
        if (map.containsKey(keyToCheck)) {
            // 存在していた場合の表示
            System.out.println(keyToCheck + " は存在します");
        } else {
            // 存在していなかった場合の表示
            System.out.println(keyToCheck + " は存在しません");
        }
    }
}
