import java.util.Stack;

public class lesson36 {

    // 逆ポーランド記法を評価（ひょうか）するメソッド
    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();  // スタックを作成（さくせい）

        // 入力文字列（にゅうりょくもじれつ）をスペースで分割（ぶんかつ）してトークンにする
        String[] tokens = expression.split(" ");

        // トークンを順番（じゅんばん）に処理（しょり）
        for (String token : tokens) {
            if (isOperator(token)) {
                // 演算子（えんざんし）の場合
                int right = stack.pop();  // 右側（みぎがわ）の値を取り出す（ポップ）
                int left = stack.pop();   // 左側（ひだりがわ）の値を取り出す

                // 演算（えんざん）をして結果を得る
                int result = applyOperator(left, right, token);

                // 結果をスタックに戻す（プッシュ）
                stack.push(result);
            } else {
                // 数値（すうじ）の場合、整数に変換してスタックに積む（プッシュ）
                stack.push(Integer.parseInt(token));
            }
        }

        // スタックに残った唯一の値が計算結果（けいさんけっか）
        return stack.pop();
    }

    // 演算子かどうかを判定（はんてい）するメソッド
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // 演算子に応じた計算を行うメソッド
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
                // ここには来ない想定（そうてい）
                return 0;
        }
    }

    // 動作確認用（どうさかくにんよう）mainメソッド
    public static void main(String[] args) {
        String input1 = "2 3 + 4 *";
        System.out.println(input1 + " = " + evaluate(input1)); // 期待（きたい）: 20

        String input2 = "5 3 -";
        System.out.println(input2 + " = " + evaluate(input2)); // 期待: 2

        String input3 = "10 2 / 5 *";
        System.out.println(input3 + " = " + evaluate(input3)); // 期待: 25
    }
}
