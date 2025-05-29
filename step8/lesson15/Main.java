// クライアントコード（どあをひらこうとする）
public class Main {
    public static void main(String[] args) {
        // 正しいパスワードは "1234"
        DoorProxy secretDoor = new DoorProxy("1234");

        // 間違ったパスワードで開けようとする
        System.out.println("Attempting to open the door with wrong password...");
        secretDoor.open("0000");  // 拒否（きょひ）される

        // 正しいパスワードで開ける
        System.out.println("\nAttempting to open the door with correct password...");
        secretDoor.open("1234");  // 開く
    }
}
