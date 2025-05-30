// ビットコイン支払いの実装（じっそう）
// 追加（ついか）された新しい支払い方法
public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using Bitcoin...");
        // ビットコインで支払っているメッセージを表示（ひょうじ）
    }
}
