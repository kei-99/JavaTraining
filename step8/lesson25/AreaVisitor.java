// 面積（めんせき）を計算（けいさん）して表示（ひょうじ）するVisitor
public class AreaVisitor implements Visitor {
    @Override
    public void visitCircle(Circle circle) {
        double r = circle.getRadius();
        double area = Math.PI * r * r;
        System.out.println("Calculating area for Circle(radius=" + r + ") -> " + area);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double w = rectangle.getWidth();
        double h = rectangle.getHeight();
        double area = w * h;
        System.out.println("Calculating area for Rectangle(width=" + w + ", height=" + h + ") -> " + area);
    }
}
