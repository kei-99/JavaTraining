// Visitorインターフェース。図形ごとにvisitメソッドを用意（ようい）する。
public interface Visitor {
    void visitCircle(Circle circle);         // 円（えん）への処理
    void visitRectangle(Rectangle rectangle); // 長方形（ちょうほうけい）への処理
}
