// Mainクラス：BankAccountクラスの動作をテストするための実行クラス
public class Main {
    public static void main(String[] args) {

        // BankAccountオブジェクトを生成（口座番号123456、初期残高10000円）
        BankAccount myAccount = new BankAccount(123456, 10000);

        // 口座番号と初期残高を表示
        System.out.println("口座番号: " + myAccount.getAccountNumber());
        System.out.println("初期残高: " + myAccount.getBalance() + "円");

        // 5000円を預け入れる
        myAccount.deposit(5000);
        // 3000円を引き出す
        myAccount.withdraw(3000);

        // 最終的な残高を表示
        System.out.println("最終残高: " + myAccount.getBalance() + "円");

        // 以下のコードはコンパイルエラーになるためコメントアウト
        // myAccount.balance = 50000; // 直接(ちょくせつ)アクセスできないことを確認するため
    }
}
