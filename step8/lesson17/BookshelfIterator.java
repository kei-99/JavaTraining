// 通常（つうじょう）のイテレータクラス
public class BookshelfIterator implements Iterator {
    // 本棚（ほんだな）への参照（さんしょう）
    private Bookshelf bookshelf;

    // 現在（げんざい）のインデックス
    private int index = 0;

    // コンストラクタ（ほんだなをうけとる）
    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    // 次（つぎ）の本（ほん）があるかどうかをしらべる
    @Override
    public boolean hasNext() {
        return index < bookshelf.getSize();
    }

    // 次（つぎ）の本（ほん）を取得（しゅとく）して、インデックスを1つ進める（すすめる）
    @Override
    public Book next() {
        return bookshelf.getBookAt(index++);
    }
}
