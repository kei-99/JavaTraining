// 砂糖（さとう）トッピングを追加（ついか）するデコレータークラス
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // 元の説明に「+ Sugar」を追加
        return coffee.getDescription() + " + Sugar";
    }

    @Override
    public double getCost() {
        // 砂糖の追加価格は0.20ドル
        return coffee.getCost() + 0.20;
    }
}
