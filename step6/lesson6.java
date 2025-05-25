import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        Scanner scanner = new Scanner(System.in);

        System.out.print("配列の内容: [10, 20, 30]\n配列のインデックスを入力してください: ");
        int index = scanner.nextInt();

        System.out.print("割り算の分母を入力してください: ");
        int denominator = scanner.nextInt();

        try {
            // ① まず index チェックのために value を取得
            int value = numbers[index];

            // ② 次に 0 で割るかチェック
            if (denominator == 0) {
                throw new ArithmeticException("0で割ることはできません。");
            }

            double result = (double) value / denominator;
            System.out.println("計算結果: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: 配列のインデックスが範囲外です。");
        } catch (ArithmeticException e) {
            System.out.println("エラー: 0で割ることはできません。");
        }

        System.out.println("プログラム終了");
        scanner.close();
    }
}
