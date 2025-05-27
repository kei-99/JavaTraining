import java.util.Stack;

public class lesson29 {
    public static void main(String[] args) {
        // Stack<Integer> を作成
        Stack<Integer> stack = new Stack<>();

        // 1から5までの値を順にpushする
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Stackの内容を表示（[1, 2, 3, 4, 5] のように表示される）
        System.out.println(stack);
    }
}
