// 円（えん）を表（あらわ）す具体的図形クラス
public class Circle implements Shape {
    private double radius;  // 半径（はんけい）

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);  // Circle用（よう）のvisitを呼（よ）ぶ
    }
}
