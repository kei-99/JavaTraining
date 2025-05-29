public class ShapeType implements Shape {
    private final String shapeName; // 図形の種類（内部状態）
    private final String color;     // 図形の色（内部状態）

    public ShapeType(String shapeName, String color) {
        this.shapeName = shapeName;
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " " + shapeName + " at (" + x + ", " + y + ")");
    }

    public String getKey() {
        return shapeName + "-" + color;
    }
}
