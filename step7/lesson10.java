import java.util.HashSet;

public class lesson10 {
    public static void main(String[] args) {
        //HashSet<String> を作成
        HashSet<String> lists = new HashSet<>();

        // 要素を追加
        lists.add("A");
        lists.add("B");
        lists.add("C");

        //　重複が登録されない
        lists.add("A");
        lists.add("B");
 
        // 最終的な要素が一意に格納され、表示
        for (String list : lists){
            System.out.println(list);
        }
    }
}
