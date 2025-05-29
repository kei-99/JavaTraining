// プロキシクラス（だいりしゃ）
public class DoorProxy implements Door {
    private RealDoor realDoor; // 本物のドア（ほんもののどあ）
    private String password;   // 正しいパスワード

    // コンストラクタ（ぱすわーどをせってい）
    public DoorProxy(String password) {
        this.realDoor = new RealDoor();
        this.password = password;
    }

    // パスワードをチェックしてドアを開ける
    public void open(String inputPassword) {
        if (inputPassword.equals(password)) {
            realDoor.open(inputPassword); // パスワードが正しいときドアを開ける
        } else {
            System.out.println("Access Denied! Incorrect password."); // 間違ったパスワードの場合
        }
    }
}
