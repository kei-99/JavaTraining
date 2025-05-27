public class lesson41 {
    private int[] stackArray;  // スタック本体（ほんたい）を表す配列（はいれつ）
    private int top;           // スタックのトップ（いちばんうえ）の位置（いち）
    private int capacity;      // スタックの最大容量（さいだいようりょう）

    // コンストラクタ（初期化しょきか）
    public lesson41(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;  // スタックが空（から）の状態（じょうたい）
    }

    // pushメソッド：スタックに要素（ようそ）を追加（ついか）
    public void push(int value) {
        if (top >= capacity - 1) {
            System.out.println("スタックが満杯（まんぱい）です。pushできません: " + value);
            return;
        }
        stackArray[++top] = value; // topを増やしてから格納（かくのう）
        System.out.println("push: " + value);
    }

    // popメソッド：スタックから要素を取り出して削除（さくじょ）
    public int pop() {
        if (isEmpty()) {
            System.out.println("スタックが空（から）です。popできません。");
            return -1;
        }
        int removed = stackArray[top--]; // topを減らして削除
        System.out.println("pop: " + removed);
        return removed;
    }

    // peekメソッド：スタックのトップを参照（さんしょう）だけする（削除しない）
    public int peek() {
        if (isEmpty()) {
            System.out.println("スタックが空（から）です。peekできません。");
            return -1;
        }
        System.out.println("peek: " + stackArray[top]);
        return stackArray[top];
    }

    // isEmptyメソッド：スタックが空かどうかを判定（はんてい）
    public boolean isEmpty() {
        return top == -1;
    }

    // スタックの中身（なかみ）を表示（ひょうじ）
    public void printStack() {
        System.out.print("現在のスタック: ");
        if (isEmpty()) {
            System.out.println("（空）");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // mainメソッド：動作確認（どうさかくにん）
    public static void main(String[] args) {
        lesson41 stack = new lesson41(5);  // 容量5のスタック作成

        stack.push(10);  // [10]
        stack.push(20);  // [10, 20]
        stack.push(30);  // [10, 20, 30]
        stack.printStack();

        stack.peek();    // 30
        stack.pop();     // 30 を削除
        stack.printStack();

        stack.push(40);  // [10, 20, 40]
        stack.push(50);  // [10, 20, 40, 50]
        stack.push(60);  // [10, 20, 40, 50, 60]
        stack.push(70);  // 満杯（push失敗）
        stack.printStack();

        // 空になるまでpop
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();  // 空になる
        stack.pop();  // さらにpop（失敗）
        stack.peek(); // 空でpeek（失敗）
    }
}
