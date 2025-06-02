public class PerimeterVisitor implements Visitor {
    @Override
    public void visitCircle(Circle circle) {
        double r = circle.getRadius();
        double perimeter = 2 * Math.PI * r;
        System.out.println("Calculating perimeter for Circle(radius=" + r + ") -> " + perimeter);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double w = rectangle.getWidth();
        double h = rectangle.getHeight();
        double perimeter = 2 * (w + h);
        System.out.println("Calculating perimeter for Rectangle(width=" + w + ", height=" + h + ") -> " + perimeter);
    }
}
