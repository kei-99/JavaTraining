import java.util.ArrayList;
import java.util.List;

// Loggerクラス（しんぐるとん）
public class Logger {
    // 唯一（ゆいいつ）のインスタンス
    private static Logger instance;

    // ログをためるリスト
    private List<String> logs;

    // プライベートコンストラクタ（外部からnewできないようにする）
    private Logger() {
        logs = new ArrayList<>();
    }

    // インスタンス取得（しゅとく）メソッド - スレッドセーフ
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // ログを追加（ついか）
    public void log(String message) {
        logs.add(message);
    }

    // ログを全部（ぜんぶ）出力（しゅつりょく）
    public void printLogs() {
        System.out.println("=== ログ一覧（いちらん） ===");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
