// Calculatorクラス：メソッドオーバーロードの例
public class Calculator {

    // メソッド1: 整数2つの加算
    // 引数として2つのint型を受け取り、その合計を返す
    public int add(int a, int b) {
        return a + b;
    }

    // メソッド2: 整数3つの加算
    // 引数として3つのint型を受け取り、その合計を返す
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // メソッド3: 小数2つの加算
    // 引数として2つのdouble型を受け取り、その合計を返す
    public double add(double a, double b) {
        return a + b;
    }
}
