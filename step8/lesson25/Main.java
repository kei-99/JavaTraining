import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(10, 5));

        // 面積計算用Visitorを使う
        System.out.println("-- Using AreaVisitor --");
        Visitor areaVisitor = new AreaVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }

        // 描画用Visitorを使う
        System.out.println("\n-- Using DrawVisitor --");
        Visitor drawVisitor = new DrawVisitor();
        for (Shape shape : shapes) {
            shape.accept(drawVisitor);
        }

        // 周囲長計算用Visitorを使う
        System.out.println("\n-- Using PerimeterVisitor --");
        Visitor perimeterVisitor = new PerimeterVisitor();
        for (Shape shape : shapes) {
            shape.accept(perimeterVisitor);
        }
    }
}
