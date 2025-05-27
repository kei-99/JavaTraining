// Animalクラス（親クラス）
class Animal {
    // 食事をする動作
    public void eat() {
        System.out.println("動物が食事をしています");
    }
}

// Dogクラス（Animalを継承）
class Dog extends Animal {
    // 犬が吠える動作
    public void bark() {
        System.out.println("ワンワン");
    }
}

// Catクラス（Animalを継承）
class Cat extends Animal {
    // 猫が鳴く動作
    public void meow() {
        System.out.println("ニャー");
    }
}

// メインクラス
public class lesson3 {
    public static void main(String[] args) {
        // Dogオブジェクトの生成
        Dog dog = new Dog();
        dog.eat();  // Animalクラスのメソッドを呼ぶ
        dog.bark(); // Dogクラスのメソッドを呼ぶ

        System.out.println();

        // Catオブジェクトの生成
        Cat cat = new Cat();
        cat.eat();  // Animalクラスのメソッドを呼ぶ
        cat.meow(); // Catクラスのメソッドを呼ぶ
    }
}
