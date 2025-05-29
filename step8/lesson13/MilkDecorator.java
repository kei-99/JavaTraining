// ミルクトッピングを追加（ついか）するデコレータークラス
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // 元の説明に「+ Milk」を追加
        return coffee.getDescription() + " + Milk";
    }

    @Override
    public double getCost() {
        // ミルクの追加価格は0.50ドル
        return coffee.getCost() + 0.50;
    }
}
