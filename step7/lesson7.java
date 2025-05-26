
import java.util.ArrayList;
import java.util.Collections;


public class lesson7 {
    public static void main(String[] args) {
        
        //  1. 1から10までを順にArrayListに格納する
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1; i<=10 ; i++){
            numbers.add(i);
        }

        // 2. 要素をシャッフル（ランダムに並び替え)
        Collections.shuffle(numbers);
 
        // 3. 拡張for文で並び替え後の全要素を表示
        for (int number: numbers){
            System.out.print(number + " ");
        }
         
    }
}
