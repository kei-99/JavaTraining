// すべての支払い方法（しはらいほうほう）が実装（じっそう）するインターフェース
public interface PaymentStrategy {
    // 支払い処理（しはらいしょり）を定義（ていぎ）
    void pay(int amount); // 金額（きんがく）を受け取って支払う
}
