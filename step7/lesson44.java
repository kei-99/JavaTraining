// エントリクラス（キーと値を持（も）つクラス）  
class Entry {
    int key;         // キー（整数（せいすう））  
    String value;    // 値（あたい、文字列（もじれつ））  
    boolean isDeleted; // 削除フラグ（さくじょふらぐ）  

    // コンストラクタ（キーと値を受（う）け取（と）る）  
    Entry(int key, String value) {  
        this.key = key;  
        this.value = value;  
        this.isDeleted = false; // 初期状態（しょきじょうたい）は削除されていない  
    }  
}  

// シンプルハッシュテーブルクラス（リニアプロービング処理（しょり））  
class SimpleHashTable {  
    private Entry[] table;   // 配列（はいれつ）（固定サイズ（こていさいず））  
    private int size;        // 配列の大きさ（おおきさ）  

    // コンストラクタ（サイズを決（き）める）  
    public SimpleHashTable(int size) {  
        this.size = size;  
        this.table = new Entry[size];  
    }  

    // ハッシュ関数（かんすう）（キーを配列のインデックスに変換（へんかん）する）  
    private int hash(int key) {  
        return key % size; // キーを配列サイズで割（わ）った余り（あまり）  
    }  

    // putメソッド（キーと値を格納（かくのう）する）  
    public void put(int key, String value) {  
        int index = hash(key); // 最初（さいしょ）のインデックス  
        int startIndex = index; // ループを防（ふせ）ぐために覚（おぼ）えておく  

        do {  
            Entry entry = table[index];  
            if (entry == null || entry.isDeleted) {  
                // 空（から）または削除済（さくじょず）みならここに追加（ついか）  
                table[index] = new Entry(key, value);  
                return;  
            } else if (entry.key == key) {  
                // 同（おな）じキーがあれば値を更新（こうしん）  
                entry.value = value;  
                entry.isDeleted = false; // 削除フラグを戻（もど）す  
                return;  
            }  
            // 衝突（しょうとつ）したら次（つぎ）のインデックスへ  
            index = (index + 1) % size;  
        } while (index != startIndex);  

        System.out.println("ハッシュテーブルが満杯（まんぱい）です: key=" + key);  
    }  

    // getメソッド（キーから値を検索（けんさく）する）  
    public String get(int key) {  
        int index = hash(key);  
        int startIndex = index;  

        do {  
            Entry entry = table[index];  
            if (entry == null) {  
                // 空の場所があれば存在（そんざい）しないと判断（はんだん）  
                return null;  
            }  
            if (!entry.isDeleted && entry.key == key) {  
                // 削除されておらず、キーが一致（いっち）すれば値を返（かえ）す  
                return entry.value;  
            }  
            index = (index + 1) % size;  
        } while (index != startIndex);  

        return null;  
    }  

    // removeメソッド（キーのエントリを削除する）  
    public void remove(int key) {  
        int index = hash(key);  
        int startIndex = index;  

        do {  
            Entry entry = table[index];  
            if (entry == null) {  
                System.out.println("キー " + key + " は存在しません。");  
                return;  
            }  
            if (!entry.isDeleted && entry.key == key) {  
                entry.isDeleted = true; // 削除フラグを立（た）てる  
                System.out.println("キー " + key + " を削除しました。");  
                return;  
            }  
            index = (index + 1) % size;  
        } while (index != startIndex);  

        System.out.println("キー " + key + " は存在しません。");  
    }  
}  

// メインクラス（動作確認用（どうさかくにんよう））  
public class lesson44 {  
    public static void main(String[] args) {  
        SimpleHashTable hashTable = new SimpleHashTable(5); // 配列サイズを決定（けってい）  

        // いくつかのデータを格納（かくのう）  
        hashTable.put(1, "りんご");    // apple  
        hashTable.put(6, "みかん");    // mandarin  
        hashTable.put(11, "バナナ");   // banana  
        hashTable.put(16, "ぶどう");   // grape  
        hashTable.put(21, "もも");     // peach  

        // 検索して値を表示（ひょうじ）  
        System.out.println("キー 6 の値: " + hashTable.get(6));   // みかん  
        System.out.println("キー 21 の値: " + hashTable.get(21)); // もも  
        System.out.println("キー 3 の値: " + hashTable.get(3));   // null（存在しない）  

        // 削除  
        hashTable.remove(11);  // キー11を削除  
        hashTable.remove(3);   // 存在しないキーを削除しようとする  

        // 削除後の検索  
        System.out.println("キー 11 の値: " + hashTable.get(11)); // nullになる  

        // 削除した場所に新しいデータを格納  
        hashTable.put(11, "キウイ");  
        System.out.println("キー 11 の値: " + hashTable.get(11));  
    }  
}
