// 銀行振込（ぎんこうふりこみ）の実装（じっそう）
public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using Bank Transfer...");
        // 銀行振込で支払っているメッセージを表示（ひょうじ）
    }
}
