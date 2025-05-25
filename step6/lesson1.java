import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // ユーザーから分子と分母を入力
            System.out.print("分子を入力してください: ");
            int numerator = scanner.nextInt();

            System.out.print("分母を入力してください: ");
            int denominator = scanner.nextInt();

            // 明示的に0で割る前にチェック
            if (denominator == 0) {
                throw new ArithmeticException("0で割ることはできません。");
            }

            double result = (double) numerator / denominator;
            System.out.println("結果: " + result);

        } catch (ArithmeticException e) {
            System.out.println("エラー: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("エラー: 無効な入力です。");
        } finally {
            System.out.println("プログラム終了");
        }

        scanner.close();
    }
}
