public class Main {
    public static void main(String[] args) {
        // Calculatorオブジェクトを生成
        Calculator calc = new Calculator();

        // メソッド1を呼び出し（整数2つの加算）
        int result1 = calc.add(10, 20);
        System.out.println("add(int, int)の結果: " + result1);  // 30を期待

        // メソッド2を呼び出し（整数3つの加算）
        int result2 = calc.add(5, 15, 25);
        System.out.println("add(int, int, int)の結果: " + result2);  // 45を期待

        // メソッド3を呼び出し（小数2つの加算）
        double result3 = calc.add(1.5, 2.5);
        System.out.println("add(double, double)の結果: " + result3);  // 4.0を期待
    }
}
