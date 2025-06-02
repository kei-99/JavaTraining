public class Rectangle implements Shape {
    private double width;   // 幅（はば）
    private double height;  // 高（たか）さ

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);  // Rectangle用（よう）のvisitを呼（よ）ぶ
    }
}
