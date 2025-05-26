
import java.util.HashSet;

public class lesson11 {
    public static void main(String[] args) {
        // Hashset を作成
        HashSet<String> languages=new HashSet<>();

        // 1. Hashset に"Java"を追加
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Go");

        // 2."Java" を remove メソッドで削除
        languages.remove("Java");

        // 3. HashSet の内容を表示
        System.out.println("削除後のHashSetの内容:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
