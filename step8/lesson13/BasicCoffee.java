// 基本（きほん）のブラックコーヒークラス
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        // 基本のコーヒーの説明を返（かえ）す
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        // 基本価格（きほんかかく）は5ドル
        return 5.00;
    }
}