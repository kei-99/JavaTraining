// 黄信号 (きいろしんごう) のクラス
public class YellowLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        // 次 (つぎ) の状態 (じょうたい) へ：赤信号 (あかしんごう)
        trafficLight.setState(new RedLightState());
    }

    @Override
    public void display() {
        System.out.println("Current state: Yellow Light - Caution"); // 現在 (げんざい) の状態 (じょうたい)
    }
}
