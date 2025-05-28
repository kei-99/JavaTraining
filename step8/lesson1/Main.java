// メインクラス：プログラムの実行（じっこう）を行（おこな）う
public class Main {
    public static void main(String[] args) {
        // Dog（ドッグ）オブジェクトの生成（せいせい）
        Dog dog = new Dog();
        dog.eat();  // 親（おや）クラスをオーバーライドしたメソッド
        dog.bark(); // Dog（ドッグ）クラス特有（とくゆう）のメソッド

        // Cat（キャット）オブジェクトの生成（せいせい）
        Cat cat = new Cat();
        cat.eat();   // 親（おや）クラスをオーバーライドしたメソッド
        cat.meow();  // Cat（キャット）クラス特有（とくゆう）のメソッド

        // 多態性（たたいせい）の実装（じっそう）：Animal（アニマル）型（がた）の配列（はいれつ）
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            // オーバーライドされたeat（イート）メソッドを呼（よ）び出（だ）す
            animal.eat();
        }
    }
}
