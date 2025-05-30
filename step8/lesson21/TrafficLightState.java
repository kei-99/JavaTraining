// 状態 (じょうたい) インターフェース
public interface TrafficLightState {
    void handle(TrafficLight trafficLight); // 状態 (じょうたい) を変更 (へんこう) する
    void display();                          // 状態 (じょうたい) を表示 (ひょうじ) する
}
