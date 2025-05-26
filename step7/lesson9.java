import java.util.ArrayList;

public class lesson9 {
    public static void main(String[] args) {
        // 1. ArrayList に 1〜10 を追加
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("ArrayListの内容: " + list);

        // 2. 中間要素の取得 (インデックス5と4両方を表示)
        int middleIndex1 = list.size() / 2;     // → インデックス5（6番目の要素）
        int middleIndex2 = list.size() / 2 - 1; // → インデックス4（5番目の要素）

        System.out.println("中間（size/2）インデックス: " + middleIndex1 + ", 値: " + list.get(middleIndex1));
        System.out.println("中間（size/2 - 1）インデックス: " + middleIndex2 + ", 値: " + list.get(middleIndex2));
    }
}
