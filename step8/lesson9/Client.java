// プロトタイプインターフェース
interface Shape extends Cloneable {
    Shape clone();
    void draw();
}

// Circleクラス
class Circle implements Shape {
    private String name;
    private String color;

    public Circle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.name, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle [name=" + name + ", color=" + color + "]");
    }
}

// Rectangleクラス
class Rectangle implements Shape {
    private String name;
    private String color;

    public Rectangle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.name, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle [name=" + name + ", color=" + color + "]");
    }
}

// クライアントコード
public class Client {
    public static void main(String[] args) {
        // 元となる図形を作成
        Shape originalCircle = new Circle("Circle1", "Red");
        Shape originalRectangle = new Rectangle("Rectangle1", "Blue");

        // 元の図形を描画
        originalCircle.draw();       // Drawing Circle [name=Circle1, color=Red]
        originalRectangle.draw();    // Drawing Rectangle [name=Rectangle1, color=Blue]

        // 複製された図形を作成
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        // クローンされた図形を描画
        clonedCircle.draw();         // Drawing Circle [name=Circle1, color=Red]
        clonedRectangle.draw();      // Drawing Rectangle [name=Rectangle1, color=Blue]

        // クローンを変更して元の図形に影響がないことを確認
        System.out.println("\nChanging cloned shapes...");
        // ここでは実際に変更処理はしていませんが、型キャストしてアクセス可能
        ((Circle) clonedCircle).draw();
        ((Rectangle) clonedRectangle).draw();
    }
}
