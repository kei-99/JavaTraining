// ジェネリクス（型〈かた〉をあたえる）にたいおうしたハッシュテーブルのクラス
public class lesson45<K, V> {

    // 内部（ないぶ）クラス Entry（れんけつリストのノード）  
    private static class Entry<K, V> {
        K key;            // キー（けんしょうようの値）  
        V value;          // 値（あたい）  
        Entry<K, V> next; // 次（つぎ）のノード  

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry<K, V>[] table; // 配列（はいれつ）：バケットの集まり
    private int size;            // 配列のサイズ

    // コンストラクタ（はいれつのサイズをきめる）
    @SuppressWarnings("unchecked")
    public lesson45(int size) {
        this.size = size;
        // Javaではジェネリクスの配列をそのままつくれないのでキャスト（変換）
        table = (Entry<K, V>[]) new Entry[size];
    }

    // ハッシュ関数（関数：かんすう）→ key の hashCode を使って配列の位置（いち）を決める
    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    // put メソッド：キーと値のペアを追加（ついか）または更新（こうしん）
    public void put(K key, V value) {
        int index = hash(key); // 配列のインデックス（ばしょ）を計算
        Entry<K, V> head = table[index];

        // すでに同じキーがあるかどうかを確認（かくにん）
        Entry<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value; // 値を更新する
                return;
            }
            current = current.next;
        }

        // 同じキーがないので、新しいノードを先頭に追加
        Entry<K, V> newNode = new Entry<>(key, value);
        newNode.next = head;
        table[index] = newNode;
    }

    // get メソッド：キーに対応する値（あたい）を取得（しゅとく）
    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value; // 見つかったら返す
            }
            current = current.next;
        }

        return null; // 見つからなかったら null を返す
    }

    // remove メソッド：キーに対応するノードを削除（さくじょ）する
    public void remove(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    // 先頭ノードを削除する場合
                    table[index] = current.next;
                } else {
                    // 中間（ちゅうかん）または末尾（まつび）のノードを削除
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // テスト用の main メソッド（しどうようのプログラム）
    public static void main(String[] args) {
        lesson45<String, Integer> table = new lesson45<>(10); // サイズ10のテーブルを作成

        // データを put して保存（ほぞん）
        table.put("Apple", 100);
        table.put("Banana", 200);
        table.put("Orange", 300);
        table.put("Grape", 400);

        // 値を get で取り出す
        System.out.println("Banana: " + table.get("Banana")); // 200

        // 値を更新する（Apple を 150 に）
        table.put("Apple", 150);
        System.out.println("Apple (updated): " + table.get("Apple")); // 150

        // Orange を削除
        table.remove("Orange");
        System.out.println("Orange (after removal): " + table.get("Orange")); // null

        // 衝突（しょうとつ）の例：Avocado を追加
        table.put("Avocado", 500);
        System.out.println("Avocado: " + table.get("Avocado")); // 500
    }
}
