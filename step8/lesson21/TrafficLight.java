// 信号機 (しんごうき) クラス（コンテキスト）
public class TrafficLight {
    private TrafficLightState state; // 現在 (げんざい) の状態 (じょうたい)

    public TrafficLight() {
        // 初期状態 (しょきじょうたい) は赤 (あか)
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state; // 状態 (じょうたい) をセット
    }

    public void changeState() {
        state.handle(this); // 次 (つぎ) の状態 (じょうたい) に変 (か) わる
    }

    public void showState() {
        state.display(); // 現在 (げんざい) の状態 (じょうたい) を表示 (ひょうじ)
    }
}
