import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Scanner fileScanner = null;

        try {
            // ユーザーにファイルパスを入力させる
            System.out.print("ファイルパスを入力してください: ");
            String filePath = inputScanner.nextLine();

            // ファイル読み取り用Scannerを作成
            File file = new File(filePath);
            fileScanner = new Scanner(file);

            System.out.println("ファイル内容:");

            // ファイルを1行ずつ読み取って表示
            // F:\Act One Training\Java\JavaTraining\README.md
            boolean hasContent = false;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                hasContent = true;
            }

            if (!hasContent) {
                throw new IOException();  // ファイルが空の場合
            }

            System.out.println("ファイルの内容を表示しました。");

        } catch (FileNotFoundException e) {
            System.out.println("エラー: 指定されたファイルが見つかりません。");
        } catch (IOException e) {
            System.out.println("エラー: ファイルの読み取り中に問題が発生しました。"); // F:/Learning/JWD_Chapter_1_Core_Java_Part_7Exception_Handling_&_IOnew.pdf
        } finally {
            // ファイルScannerが開かれていれば閉じる
            if (fileScanner != null) {
                fileScanner.close();
            }
            inputScanner.close();
            System.out.println("プログラム終了");
        }
    }
}
