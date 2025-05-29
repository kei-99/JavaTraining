// クライアントコード（動作確認用）
public class Main {
    public static void main(String[] args) {
        // 基本（きほん）のコーヒーを作成（さくせい）
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");

        // ミルクを追加（ついか）
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");

        // 砂糖（さとう）を追加（ついか）
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");

        // ホイップクリームを追加（ついか）
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");
    }
}
