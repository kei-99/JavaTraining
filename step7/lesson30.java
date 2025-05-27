import java.util.Stack;

public class lesson30 {
    public static void main(String[] args) {
        // 課題29で作成したStackを準備（1〜5が入っている）
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // popメソッドで一番上の要素を取り出す
        Integer poppedValue = stack.pop();

        // 取り出した値を表示
        System.out.println("取り出された値: " + poppedValue);

        // pop後のStackの内容を表示
        System.out.println("操作後のStack: " + stack);
    }
}
