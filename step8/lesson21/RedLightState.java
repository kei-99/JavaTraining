// 赤信号 (あかしんごう) のクラス
public class RedLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        // 次 (つぎ) の状態 (じょうたい) へ：青信号 (あおしんごう)
        trafficLight.setState(new GreenLightState());
    }

    @Override
    public void display() {
        System.out.println("Current state: Red Light - Stop"); // 現在 (げんざい) の状態 (じょうたい)
    }
}
