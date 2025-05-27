// ノードを表すクラス（節点：せってん）
class Node {
    int value;       // 値（あたい）
    Node left;       // 左（ひだり）の子（こ）ノード
    Node right;      // 右（みぎ）の子（こ）ノード

    // コンストラクタ：ノード作成時に値を設定
    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// 二分探索木（にぶんたんさくぎ）クラス
class BinarySearchTree {
    Node root;  // ルートノード（木の根）

    // コンストラクタ：最初は空の木（rootはnull）
    BinarySearchTree() {
        this.root = null;
    }

    // ノードを木に挿入（そうにゅう）するメソッド
    void insert(int value) {
        root = insertRecursive(root, value);
    }

    // 挿入を再帰的に行うヘルパーメソッド
    private Node insertRecursive(Node current, int value) {
        if (current == null) { // 現在の場所が空なら新しいノードを作る
            return new Node(value);
        }
        if (value < current.value) {
            // 挿入値が小さいなら左の子へ
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            // 挿入値が大きいなら右の子へ
            current.right = insertRecursive(current.right, value);
        } else {
            // 同じ値は無視（または更新しない）
            // ここでは何もしない
        }
        return current; // 変更したノードを返す
    }

    // 値を検索するメソッド：存在すればtrue、なければfalse
    boolean search(int value) {
        return searchRecursive(root, value);
    }

    // 検索の再帰ヘルパーメソッド
    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false; // ノードがない→値は存在しない
        }
        if (value == current.value) {
            return true; // 見つかった
        }
        if (value < current.value) {
            // 小さければ左の子を探す
            return searchRecursive(current.left, value);
        } else {
            // 大きければ右の子を探す
            return searchRecursive(current.right, value);
        }
    }
}

public class lesson43 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // 値の挿入（そうにゅう）
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // 検索と結果表示
        int[] tests = {50, 40, 90}; // 50と40はある、90はない

        for (int value : tests) {
            boolean found = bst.search(value);
            System.out.println(value + " は木の中に" + (found ? "あります。" : "ありません。"));
        }
    }
}
