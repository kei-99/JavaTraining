// クライアントコード：支払い方法（しはらいほうほう）を選択（せんたく）して実行（じっこう）
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(); // 支払い処理クラスのインスタンス

        // クレジットカードで支払い
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.executePayment(100); // $100を支払う

        // PayPalで支払い
        processor.setPaymentStrategy(new PayPalPayment());
        processor.executePayment(200); // $200を支払う

        // 銀行振込で支払い
        processor.setPaymentStrategy(new BankTransferPayment());
        processor.executePayment(300); // $300を支払う

        // ビットコインで支払い
        processor.setPaymentStrategy(new BitcoinPayment());
        processor.executePayment(400); // $400を支払う
    }
}
