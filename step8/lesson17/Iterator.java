// イテレータのインターフェース
public interface Iterator {
    // 次（つぎ）の本（ほん）があるかどうかをかくにん
    boolean hasNext();

    // 次（つぎ）の本（ほん）を取得（しゅとく）
    Book next();
}
