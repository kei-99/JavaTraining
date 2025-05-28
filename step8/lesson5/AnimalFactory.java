public class AnimalFactory {
    public static Animal createAnimal(String type) {
        type = type.toLowerCase(); // 小文字（こもじ）に変換（へんかん）

        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                return null; // 無効（むこう）な入力（にゅうりょく）
        }
    }
}
