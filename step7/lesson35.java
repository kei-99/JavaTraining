import java.util.Stack;

public class lesson35 {

    //  逆ポーランド記法（ぎゃくポーランドきほう）
    public static int evaluate(String expression) {
        // 計算中（けいさんちゅう）に数値（すうち）を保存（ほぞん）するためのスタックを作成（さくせい）します
        Stack<Integer> stack = new Stack<>();

       // 入力文字列（にゅうりょくもじれつ）をスペースで分割（ぶんかつ）して、トークンにします
        String[] tokens = expression.split(" ");

        // トークンを一つずつ処理（しょり）する
        for (String token : tokens) {
            // 演算子（えんざんし）の場合
            if (isOperator(token)) {
                // スタックから2つの数値（すうち）をポップする（最初に右側（みぎがわ）、次に左側（ひだりがわ））
                int right = stack.pop();
                int left = stack.pop();

                // 演算（えんざん）をして
                int result = applyOperator(left, right, token);
                // 結果（けっか）をスタックに戻（もど）す
                stack.push(result);
            } else {
                // 数字（すうじ）の場合はスタックにプッシュする
                stack.push(Integer.parseInt(token));
            }
        }

        // 最終的にスタックに残った値が計算結果
        return stack.pop();
    }

    // トークンが演算子かどうかを判定するメソッド
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // 演算子に応じて計算を行うメソッド
    private static int applyOperator(int left, int right, String operator) {
        switch (operator) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                return 0;
        }
    }

    // 動作確認用のmainメソッド
    public static void main(String[] args) {
        String input = "2 3 + 4 *";
        int result = evaluate(input);
        System.out.println("計算結果: " + result); // 期待値：20
    }
}
