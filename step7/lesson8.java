import java.util.*;

public class lesson8 {
    public static void main(String[] args) {
        // 元のリスト（重複あり）
        ArrayList<Integer> originalList = new ArrayList<>(
            Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5)
        );

        System.out.println("元のリスト（重複あり）:");
        originalList.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 方法①: HashSet（順序保証なし）
        Set<Integer> hashSet = new HashSet<>(originalList);
        System.out.println("【HashSet使用】");
        for (int n : hashSet) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // 方法②: LinkedHashSet（追加順を保持）
        Set<Integer> linkedHashSet = new LinkedHashSet<>(originalList);
        System.out.println("【LinkedHashSet使用】");
        for (int n : linkedHashSet) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // 方法③: Stream の distinct()
        List<Integer> distinctList = originalList.stream()
                .distinct()
                .toList();
        System.out.println("【Stream.distinct()使用】");
        distinctList.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
