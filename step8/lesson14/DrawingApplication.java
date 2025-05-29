public class DrawingApplication {
    public static void main(String[] args) {
        Shape redCircle1 = ShapeFactory.getShape("Circle", "Red");
        redCircle1.draw(10, 20);

        Shape blueTriangle = ShapeFactory.getShape("Triangle", "Blue");
        blueTriangle.draw(30, 40);

        Shape redCircle2 = ShapeFactory.getShape("Circle", "Red");
        redCircle2.draw(50, 60);

        System.out.println("Same instance used for Red Circle: " + (redCircle1 == redCircle2));
    }
}
