import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // ユーザーから文字列を入力
            System.out.print("文字列を入力してください: ");
            String input = scanner.nextLine();

            // nullチェック（ユーザーが何も入力せず Enter を押すと "" になるが、null ではない）
            if (input == null || input.isEmpty()) {
                throw new NullPointerException();
            }


            // ユーザーからインデックスを入力
            System.out.print("インデックスを入力してください: ");
            int index = scanner.nextInt();

            // 指定されたインデックスの文字を取得
            char character = input.charAt(index);
            System.out.println("指定されたインデックスの文字: " + character);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("エラー: インデックスが文字列の範囲外です。");
        } catch (NullPointerException e) {
            System.out.println("エラー: nullの値に操作を行うことはできません。");
        } catch (Exception e) {
            System.out.println("エラー: 無効な入力です。");
        } finally {
            System.out.println("プログラム終了");
        }

        scanner.close();
    }
}
