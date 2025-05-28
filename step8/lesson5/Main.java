import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("どの動物（どうぶつ）を生成（せいせい）しますか？（dog, cat, bird）：");
        String input = scanner.nextLine();

        Animal animal = AnimalFactory.createAnimal(input);

        if (animal != null) {
            animal.makeSound(); // 鳴（な）き声（ごえ）を出力（しゅつりょく）
        } else {
            System.out.println("そのような動物（どうぶつ）は存在（そんざい）しません。");
        }

        scanner.close(); // リソース解放（かいほう）
    }
}
