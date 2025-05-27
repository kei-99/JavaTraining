// ノードを表すクラス（Nodeクラス）
class Node {
    int data;       // データ（データ）
    Node next;      // 次のノードへの参照（さんしょう）

    // コンストラクタ（データを受け取る）
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// シングルリンクリスト（単方向連結（たんほうこうれんけつ）リスト） 
public class lesson40 {

    private Node head;  // リストの先頭（せんとう）ノード

    public lesson40() {
        this.head = null; // 最初は空のリスト
    }

    // 要素をリストの末尾（まつび）に追加するメソッド
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // リストが空なら先頭に追加
        } else {
            Node current = head;
            // 最後のノードまで移動
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; // 末尾に新しいノードを追加
        }
    }

    // 指定した値を持つノードを削除するメソッド
    public boolean remove(int data) {
        if (head == null) {
            return false; // 空リストなら何もしない
        }
        if (head.data == data) {
            head = head.next; // 先頭が削除対象なら先頭をずらす
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // 削除対象をスキップ
                return true;
            }
            current = current.next;
        }
        return false; // 見つからなかった
    }

    // 指定した値を持つノードが存在するか検索するメソッド
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true; // 見つかった
            }
            current = current.next;
        }
        return false; // 見つからなかった
    }

    // リストの内容を表示するメソッド
    public void printList() {
        Node current = head;
        System.out.print("リストの内容: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // mainメソッド（動作確認用）
    public static void main(String[] args) {
        lesson40 list = new lesson40();

        // 要素を追加
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // 追加後のリストを表示
        list.printList();

        // 検索テスト
        int searchVal = 20;
        System.out.println(searchVal + "はリストに " + (list.contains(searchVal) ? "存在します。" : "存在しません。"));

        searchVal = 50;
        System.out.println(searchVal + "はリストに " + (list.contains(searchVal) ? "存在します。" : "存在しません。"));

        // 削除テスト
        int removeVal = 30;
        boolean removed = list.remove(removeVal);
        System.out.println(removeVal + (removed ? "を削除しました。" : "は見つかりませんでした。"));

        // 削除後のリストを表示
        list.printList();
    }
}
