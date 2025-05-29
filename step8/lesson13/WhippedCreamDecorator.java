// ホイップクリームトッピングを追加（ついか）するデコレータークラス
public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // 元の説明に「+ Whipped Cream」を追加
        return coffee.getDescription() + " + Whipped Cream";
    }

    @Override
    public double getCost() {
        // ホイップクリームの追加価格は0.50ドル
        return coffee.getCost() + 0.50;
    }
}
