// Dog（ドッグ）クラス：Animal（アニマル）クラスを継承（けいしょう）
public class Dog extends Animal {
    // bark（バーク）メソッド：犬（いぬ）が吠（ほ）える
    public void bark() {
        System.out.println("ワンワン！");
    }

    // eat（イート）メソッドをオーバーライド：犬（いぬ）専用（せんよう）の食事（しょくじ）メッセージ
    @Override
    public void eat() {
        System.out.println("犬（いぬ）がドッグフードを食（た）べます。");
    }
}
