public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        // ディスプレイを作成（さくせい）
        TemperatureObserver tv = new TVDisplay();
        TemperatureObserver smartphone = new SmartphoneDisplay();
        TemperatureObserver radio = new RadioDisplay();

        // ディスプレイを登録（とうろく）
        sensor.addObserver(tv);
        sensor.addObserver(smartphone);
        sensor.addObserver(radio);

        // 温度を更新（こうしん）
        sensor.setTemperature(25);
        sensor.setTemperature(30);
        sensor.setTemperature(28);
    }
}
