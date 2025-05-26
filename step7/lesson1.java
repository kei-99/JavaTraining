import java.util.ArrayList;

public class lesson1 {
    public static void main(String[] args) {
        // ArrayListの作成（文字列型）
        ArrayList<String> fruits = new ArrayList<>();

        // 要素の追加
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // 要素の表示（拡張forループ）
        System.out.println("最初のfruitsリスト：");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // "Mango"を追加
        fruits.add("Mango");

        // 再度、全ての要素を表示
        System.out.println("\n\"Mango\"追加後のfruitsリスト：");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
