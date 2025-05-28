import java.util.Stack;

public class lesson31 {
    public static void main(String[] args) {
        // 課題30の操作後のStackを準備（[1, 2, 3, 4]）
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // peekメソッドで一番上の要素を確認（取り除かない）
        Integer topValue = stack.peek();

        // 確認した値を表示
        System.out.println("確認された値: " + topValue); //4

        // peek後のStackの内容を表示（変わっていないことを確認）
        System.out.println("操作後のStack: " + stack);
    }
}
