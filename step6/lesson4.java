import java.util.Scanner;

// ✅ カスタム例外クラスの定義
class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

public class lesson4 {

    // ✅ 値をチェックして、条件に合えば例外をスロー
    public static void checkValue(int value) throws InvalidValueException {
        if (value < 10) {
            throw new InvalidValueException("エラー: 入力された数値が小さすぎます。10以上の値を入力してください。");
        }
    }

    // ✅ メインメソッドでユーザー入力 & try-catch処理
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("数値を入力してください: ");
            int input = scanner.nextInt();

            checkValue(input); // 値をチェック（条件に合わなければ例外スロー）

            System.out.println("入力された数値は: " + input);
        } catch (InvalidValueException e) {
            // カスタム例外を処理
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // その他の例外（入力が数値でないなど）
            System.out.println("エラー: 無効な入力です。数値を入力してください。");
        } finally {
            System.out.println("プログラム終了");
            scanner.close();
        }
    }
}
