// クレジットカード支払い（しはらい）の実装（じっそう）
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card...");
        // クレジットカードで支払っているメッセージを表示（ひょうじ）
    }
}
