// Mainクラス
public class Main {
    public static void main(String[] args) {
        // 最初のインスタンス取得（しゅとく）
        Logger logger1 = Logger.getInstance();
        logger1.log("ログメッセージ1を追加しました。");
        logger1.log("ログメッセージ2を追加しました。");

        // 別の場所（ばしょ）でもう一度インスタンス取得
        Logger logger2 = Logger.getInstance();
        logger2.log("別の場所からログ3を追加。");

        // ログ出力（しゅつりょく）
        logger2.printLogs();

        // 同一インスタンスか確認（かくにん）
        if (logger1 == logger2) {
            System.out.println("logger1とlogger2は同じインスタンスです。");
        } else {
            System.out.println("異なるインスタンスです。");
        }
    }
}
