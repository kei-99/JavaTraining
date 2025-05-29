// 本物（ほんもの）のドアクラス
public class RealDoor implements Door {
    @Override
    // ドアを開けるメソッド（ぱすわーどはひつようなし）
    public void open(String password) {
        System.out.println("Opening the secret door...");
    }
}
