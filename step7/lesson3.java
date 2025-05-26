import java.util.ArrayList;

public class lesson3 {
    public static void main(String[] args) {
        // 1〜5の整数を格納するArrayListを作成
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // 値が「3」の要素を削除（値指定）
        numbers.remove(Integer.valueOf(3));

        // 3番目の要素（index = 2）を削除（インデックス指定）
        if (numbers.size() > 2) {
            numbers.remove(2);
        }

        // 全要素を表示（拡張for文）
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
