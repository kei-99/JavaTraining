// 動物（どうぶつ）クラス（親クラス）
class Animal {
    // 名前（なまえ）のフィールド
    String name;

    // コンストラクタ（なまえを設定）
    public Animal(String name) {
        this.name = name;
    }

    // あいさつ（さつえい）メソッド
    public void speak() {
        System.out.println("私は動物です。");  // わたしはどうぶつです
    }
}

// 犬（いぬ）クラス（Animalを継承）
class Dog extends Animal {
    public Dog(String name) {
        super(name);  // 親クラスのコンストラクタを呼ぶ
    }

    // オーバーライド（上書き）メソッド
    @Override
    public void speak() {
        System.out.println("ワンワン！私は犬（いぬ）の " + name + " です。");
    }
}

// 猫（ねこ）クラス（Animalを継承）
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("ニャー！私は猫（ねこ）の " + name + " です。");
    }
}

// メインクラス（どうさかくにん）
public class lesson1 {
    public static void main(String[] args) {
        Animal a = new Animal("動物");  // 親クラスのインスタンス
        Dog d = new Dog("ポチ");         // 子クラス（犬）のインスタンス
        Cat c = new Cat("ミケ");         // 子クラス（猫）のインスタンス

        a.speak();  // 親のメソッド
        d.speak();  // オーバーライドされた犬のメソッド
        c.speak();  // オーバーライドされた猫のメソッド
    }
}
