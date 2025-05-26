import java.util.ArrayList;

public class lesson2 {
    public static void main(String[] args){
        // 整数を格納する　ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // 1 から5 の値を追加する
        for (int i=1 ; i <= 5  ; i++){
            numbers.add(i);
        }


        // ArrayList の内容をすべて表示
        for(int number : numbers){
            System.err.println(number);
        }



    }
}
