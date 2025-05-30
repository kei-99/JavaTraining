// 青信号 (あおしんごう) のクラス
public class GreenLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        // 次 (つぎ) の状態 (じょうたい) へ：黄信号 (きいろしんごう)
        trafficLight.setState(new YellowLightState());
    }

    @Override
    public void display() {
        System.out.println("Current state: Green Light - Go"); // 現在 (げんざい) の状態 (じょうたい)
    }
}
