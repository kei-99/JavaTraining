// PayPal支払いの実装（じっそう）
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal...");
        // PayPalで支払っているメッセージを表示（ひょうじ）
    }
}
