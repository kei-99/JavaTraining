// デコレーターの抽象クラス（ちゅうしょうクラス）
// コーヒーにトッピングを追加（ついか）するための基底（きてい）クラス
public abstract class CoffeeDecorator implements Coffee {
    // 元（もと）のコーヒーオブジェクトを保持（ほじ）する
    protected Coffee coffee;

    // コンストラクタ：デコレーターに元のコーヒーを渡（わた）す
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        // 元のコーヒーの説明を返す（基本は追加なし）
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        // 元のコーヒーの価格を返す（基本は追加なし）
        return coffee.getCost();
    }
}
