// BankAccountクラス：銀行口座を表し、カプセル化を実現するクラス
public class BankAccount {

    // 口座番号（プライベートフィールド）
    private int accountNumber;
    // 残高（プライベートフィールド）
    private int balance;

    // コンストラクタ：口座番号と初期残高を設定する
    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // 口座番号を取得するゲッターメソッド
    public int getAccountNumber() {
        return accountNumber;
    }

    // 残高を取得するゲッターメソッド
    public int getBalance() {
        return balance;
    }

    // 預け入れメソッド
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "円を預け入れました。");
        } else {
            System.out.println("預け入れ金額が不正です。");
        }
    }

    // 引き出しメソッド
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("引き出し金額が不正です。");
        } else if (amount > balance) {
            System.out.println("残高が不足しています。");
        } else {
            balance -= amount;
            System.out.println(amount + "円を引き出しました。");
        }
    }
}
