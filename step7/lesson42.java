// ノード（Node）を表（あらわ）すクラス
class Node {
    int value;           // ノードの値（あたい）
    Node left, right;    // 左（ひだり）と右（みぎ）の子（こ）ノード

    // コンストラクタ（初期化しょきか）
    Node(int value) {
        this.value = value;  // 引数（ひきすう）の値（あたい）をセット
        left = right = null; // 最初（さいしょ）は子（こ）を持（も）たない
    }
}

// 二分探索木（にぶんたんさくぎ）を表（あらわ）すクラス
class BinarySearchTree {
    Node root;  // 木（き）の根（ね）ノード

    // 値（あたい）を木（き）に挿入（そうにゅう）する
    void insert(int value) {
        root = insertRecursive(root, value);
    }

    // 再帰的（さいきてき）に挿入（そうにゅう）するヘルパーメソッド
    Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value); // 空（から）なら新（あたら）しいノードを作（つく）る
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value); // 小（ちい）さい→左（ひだり）へ
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value); // 大（おお）きい→右（みぎ）へ
        }
        return node; // ノードを返（かえ）す
    }

    // 値（あたい）を検索（けんさく）する
    boolean search(int value) {
        return searchRecursive(root, value);
    }

    // 再帰的（さいきてき）に検索（けんさく）する
    boolean searchRecursive(Node node, int value) {
        if (node == null) return false;         // ノードが空（から）なら見つからない
        if (value == node.value) return true;   // 見（み）つけた！

        if (value < node.value)
            return searchRecursive(node.left, value);   // 小（ちい）さければ左（ひだり）
        else
            return searchRecursive(node.right, value);  // 大（おお）きければ右（みぎ）
    }

    // 値（あたい）を削除（さくじょ）する
    void delete(int value) {
        root = deleteRecursive(root, value);
    }

    // 再帰的（さいきてき）に削除（さくじょ）する
    Node deleteRecursive(Node node, int value) {
        if (node == null) return null; // 見（み）つからない場合（ばあい）

        if (value < node.value) {
            node.left = deleteRecursive(node.left, value);   // 左（ひだり）へ進（すす）む
        } else if (value > node.value) {
            node.right = deleteRecursive(node.right, value); // 右（みぎ）へ進（すす）む
        } else {
            // ノードを見つけた！

            // 子（こ）がいない：葉（は）の場合（ばあい）
            if (node.left == null && node.right == null) {
                return null;
            }

            // 子（こ）が1つだけある場合（ばあい）
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // 子（こ）が2つある場合（ばあい）
            // 右部分木（みぎぶぶんき）から最小値（さいしょうち）を探（さが）す
            Node minNode = findMin(node.right);
            node.value = minNode.value; // 置換（ちかん）する
            node.right = deleteRecursive(node.right, minNode.value); // 再帰的（さいきてき）に削除（さくじょ）
        }
        return node;
    }

    // 最小値（さいしょうち）を探（さが）す
    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left; // 一番左（ひだり）へ
        }
        return node;
    }

    // 昇順（しょうじゅん）に表示（ひょうじ）する（中順（ちゅうじゅん）走査）
    void inorderTraversal() {
        inorderRecursive(root);
        System.out.println();
    }

    void inorderRecursive(Node node) {
        if (node != null) {
            inorderRecursive(node.left);  // 左（ひだり）
            System.out.print(node.value + " "); // 現在（げんざい）のノード
            inorderRecursive(node.right); // 右（みぎ）
        }
    }
}

// 実行用（じっこうよう）メインプログラム
public class lesson42 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // 挿入（そうにゅう）
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // 昇順（しょうじゅん）表示（ひょうじ）
        System.out.print("Initial Tree (In-order): ");
        tree.inorderTraversal();

        // 検索（けんさく）
        System.out.println("Search 40: " + tree.search(40));
        System.out.println("Search 90: " + tree.search(90));

        // 削除（さくじょ）
        tree.delete(20); // 葉（は）
        System.out.print("After deleting 20: ");
        tree.inorderTraversal();

        tree.delete(30); // 子（こ）が1つ
        System.out.print("After deleting 30: ");
        tree.inorderTraversal();

        tree.delete(50); // 子（こ）が2つ
        System.out.print("After deleting 50: ");
        tree.inorderTraversal();

        // 再検索（さいけんさく）
        System.out.println("Search 50: " + tree.search(50));
        System.out.println("Search 60: " + tree.search(60));
    }
}
