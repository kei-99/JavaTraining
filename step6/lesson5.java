import java.util.Scanner;

public class lesson5 {

    // 数値をチェックして、条件に応じて例外をスロー
    public static void validateNumber(int number) throws IllegalArgumentException {
        if (number <= 10) {
            throw new IllegalArgumentException("入力値が10以下です。");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("数値を入力してください: ");
            number = scanner.nextInt();

            try {
                // validateNumber で例外をスローする可能性あり
                validateNumber(number);
                System.out.println("入力された数値は: " + number);
            } catch (IllegalArgumentException e) {
                // 最初のスローをキャッチ
                System.out.println("スローされた例外をキャッチしました: " + e.getMessage());

                // 再スロー条件: 5以下
                if (number <= 5) {
                    throw new IllegalArgumentException("入力値が5以下です。");
                }
            }

        } catch (IllegalArgumentException e) {
            // 再スローされた例外をキャッチ
            System.out.println("再スローされた例外を処理します: " + e.getMessage());
        } catch (Exception e) {
            // 入力が整数でない場合など
            System.out.println("エラー: 無効な入力です。数値を入力してください。");
        } finally {
            System.out.println("プログラム終了");
            scanner.close();
        }
    }
}
