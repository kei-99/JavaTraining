// 支払い方法（しはらいほうほう）を管理（かんり）し、実行（じっこう）するクラス
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy; // 現在の支払い方法を保持（ほじ）

    // 支払い方法を設定（せってい）する
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 実際（じっさい）に支払いを実行（じっこう）する
    public void executePayment(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount); // 選ばれた支払い方法で支払う
        } else {
            System.out.println("No payment method selected."); // 支払い方法が選ばれていない
        }
    }
}
