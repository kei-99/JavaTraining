// Cat（キャット）クラス：Animal（アニマル）クラスを継承（けいしょう）
public class Cat extends Animal {
    // meow（ミャウ）メソッド：猫（ねこ）が鳴（な）く
    public void meow() {
        System.out.println("ニャーニャー！");
    }

    // eat（イート）メソッドをオーバーライド：猫（ねこ）専用（せんよう）の食事（しょくじ）メッセージ
    @Override
    public void eat() {
        System.out.println("猫（ねこ）がキャットフードを食（た）べます。");
    }
}
