import java.util.ArrayList;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        // ArrayList<Integer> を作成し、1〜10を追加
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Scannerを使ってコンソールから整数を入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("検索したい整数を入力してください: ");
        int target = scanner.nextInt();

        // 検索結果の表示
        if (numbers.contains(target)) {
            System.out.println(target + " は含まれています。");
        } else {
            System.out.println(target + " は含まれていません。");
        }

        // Scannerのクローズ
        scanner.close();
    }
}
