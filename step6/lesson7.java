import java.util.Scanner;

public class lesson7 {

    // 入力値をチェックし、0以下ならIllegalArgumentExceptionをスローするメソッド
    public static void validateInput(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("入力値は1以上である必要があります。");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください: ");
        int input = scanner.nextInt();

        try {
            validateInput(input);  // 入力値の検証

            // 例外が発生しなければここに到達
            System.out.println("入力値は有効です: " + input);

        } catch (IllegalArgumentException e) {
            // 例外をキャッチしてメッセージを表示
            System.out.println("エラー: " + e.getMessage());
        }

        System.out.println("プログラム終了");
        scanner.close();
    }
}
