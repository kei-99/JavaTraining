// 親クラス Animal（どうぶつ）
class Animal {
    // 名前（なまえ）を表すフィールド
    String name;

    // コンストラクタ（どうぶつのなまえをセット）
    public Animal(String name) {
        this.name = name;
    }

    // 動物（どうぶつ）が鳴（な）くメソッド（共通）
    public void sound() {
        System.out.println("動物が鳴きます");
    }

    // 動物の名前を表示
    public void showName() {
        System.out.println("名前: " + name);
    }
}

// 子クラス Dog（いぬ）は Animal を継承
class Dog extends Animal {
    public Dog(String name) {
        super(name);  // 親クラスのコンストラクタを呼び出す
    }

    // Dog特有の鳴き方を実装
    @Override
    public void sound() {
        System.out.println("ワンワン");
    }

    // Dog特有のメソッド
    public void fetch() {
        System.out.println("ボールを取ってきます");
    }
}

// 子クラス Cat（ねこ）は Animal を継承
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Cat特有の鳴き方を実装
    @Override
    public void sound() {
        System.out.println("ニャー");
    }

    // Cat特有のメソッド
    public void scratch() {
        System.out.println("ひっかきます");
    }
}

// メインクラス
public class lesson2 {
    public static void main(String[] args) {
        // Dogオブジェクトの作成
        Dog dog = new Dog("ポチ");
        dog.showName();
        dog.sound();
        dog.fetch();

        System.out.println();

        // Catオブジェクトの作成
        Cat cat = new Cat("タマ");
        cat.showName();
        cat.sound();
        cat.scratch();
    }
}
