// メインクラス（実行（じっこう）するところ）
public class Main {
    public static void main(String[] args) {
        // 本棚（ほんだな）を作成（さくせい）
        Bookshelf bookshelf = new Bookshelf();

        // 本（ほん）を追加（ついか）
        bookshelf.addBook(new Book("The Catcher in the Rye"));
        bookshelf.addBook(new Book("To Kill a Mockingbird"));
        bookshelf.addBook(new Book("1984"));
        bookshelf.addBook(new Book("Moby Dick"));

        // 通常（つうじょう）のイテレータを作成（さくせい）
        Iterator iterator = bookshelf.createIterator();

        // 本（ほん）を順番（じゅんばん）に表示（ひょうじ）
        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next().getTitle());
        }

        // 改行（かいぎょう）してから、逆順（ぎゃくじゅん）を表示（ひょうじ）
        System.out.println("\nBooks in reverse order:");

        // 逆順（ぎゃくじゅん）のイテレータを作成（さくせい）
        Iterator reverseIterator = bookshelf.createReverseIterator();

        // 本（ほん）を逆順（ぎゃくじゅん）に表示（ひょうじ）
        while (reverseIterator.hasNext()) {
            System.out.println("Book: " + reverseIterator.next().getTitle());
        }
    }
}
