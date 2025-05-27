import java.util.Stack;
// スタックを使用したブラウザ履歴シミュレーション
public class lesson37 {

    private Stack<String> backStack;    // 戻る用スタック（もどるよう）
    private Stack<String> forwardStack; // 進む用スタック（すすむよう）
    private String currentPage;          // 現在（げんざい）のページ

    public lesson37() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = null;
    }

    // 新しいページを訪問（ほうもん）するメソッド
    public void visitPage(String page) {
        if (currentPage != null) {
            backStack.push(currentPage); // 今のページを戻る履歴に積む
        }
        currentPage = page;              // 新しいページに更新（こうしん）
        forwardStack.clear();            // 進む履歴はクリア
        printStatus("visit(\"" + page + "\")");
    }

    // 戻る操作（さくせん）
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);        // 今のページを進む履歴に積む
            currentPage = backStack.pop();         // 戻る履歴からページを取り出し現在ページに
        }
        printStatus("back()");
    }

    // 進む操作（さくせん）
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);            // 今のページを戻る履歴に積む
            currentPage = forwardStack.pop();       // 進む履歴からページを取り出し現在ページに
        }
        printStatus("forward()");
    }

    // 現在の状態（じょうたい）をコンソールに表示（ひょうじ）
    private void printStatus(String action) {
        System.out.println("操作: " + action);
        System.out.println("現在のページ: " + currentPage);
        System.out.println("戻るスタック: " + backStack);
        System.out.println("進むスタック: " + forwardStack);
        System.out.println("----------------------");
    }

    // 動作確認用 main メソッド
    public static void main(String[] args) {
        lesson37 browser = new lesson37();

        browser.visitPage("Page A"); // Page A
        browser.visitPage("Page B"); // Page B
        browser.visitPage("Page C"); // Page C
        browser.goBack();             // back()
        browser.goBack();             // back()
        browser.goForward();          // forward()
        browser.visitPage("Page D"); // 新規訪問（しんきほうもん）
    }
}
