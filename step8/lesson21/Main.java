// クライアントコード
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(); // 信号機 (しんごうき) を作成 (さくせい)

        // 信号 (しんごう) を4回 (よんかい) 切 (き) り替 (か) える
        for (int i = 0; i < 4; i++) {
            trafficLight.showState(); // 現在 (げんざい) の状態 (じょうたい) を表示 (ひょうじ)
            System.out.println("Changing to next state..."); // 次 (つぎ) に変 (か) わる
            trafficLight.changeState(); // 状態 (じょうたい) を変更 (へんこう)
        }
    }
}
