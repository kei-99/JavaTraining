// 図形を描画したかのようにメッセージ表示するVisitor
public class DrawVisitor implements Visitor {
    @Override
    public void visitCircle(Circle circle) {
        double r = circle.getRadius();
        System.out.println("Drawing a circle with radius=" + r);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double w = rectangle.getWidth();
        double h = rectangle.getHeight();
        System.out.println("Drawing a rectangle with width=" + w + " and height=" + h);
    }
}
