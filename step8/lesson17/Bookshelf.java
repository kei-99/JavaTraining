import java.util.ArrayList;
import java.util.List;

// 本棚（ほんだな）クラス
public class Bookshelf implements IterableCollection {
    // 本（ほん）のリスト
    private List<Book> books = new ArrayList<>();

    // 本（ほん）を追加（ついか）
    public void addBook(Book book) {
        books.add(book);
    }

    // 指定（してい）したインデックスの本（ほん）を取得（しゅとく）
    public Book getBookAt(int index) {
        return books.get(index);
    }

    // 本（ほん）の数（かず）を取得（しゅとく）
    public int getSize() {
        return books.size();
    }

    // 通常（つうじょう）のイテレータを作成（さくせい）
    @Override
    public Iterator createIterator() {
        return new BookshelfIterator(this);
    }

    // 逆順（ぎゃくじゅん）のイテレータを作成（さくせい）
    public Iterator createReverseIterator() {
        return new ReverseBookshelfIterator(this);
    }
}
