// 逆順（ぎゃくじゅん）に本（ほん）をとりだすイテレータクラス
public class ReverseBookshelfIterator implements Iterator {
    // 本棚（ほんだな）への参照（さんしょう）
    private Bookshelf bookshelf;

    // 現在（げんざい）のインデックス（さいごの本（ほん）から）
    private int index;

    // コンストラクタ（ほんだなをうけとって、さいごのインデックスをせってい）
    public ReverseBookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = bookshelf.getSize() - 1; // さいごの本（ほん）からスタート
    }

    // 次（つぎ）の本（ほん）があるかをしらべる（うしろから）
    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    // 次（つぎ）の本（ほん）を取得（しゅとく）して、インデックスを1つ下（さ）げる
    @Override
    public Book next() {
        return bookshelf.getBookAt(index--);
    }
}
