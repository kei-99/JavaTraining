import java.util.ArrayList;

public class lesson5 {
    public static void main(String[] args) {
        //1~5 の整数を 順番にArraylist に追加
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1 ; i <= 5; i++){
            numbers.add(i);
        }

        // インデックスを逆順にたどって出力（numbersの並び順は変更しない）
        System.out.println("逆順で表示:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
