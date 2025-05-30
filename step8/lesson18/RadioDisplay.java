// ラジオの表示（ひょうじ）クラス
public class RadioDisplay implements TemperatureObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Radio Display: Current Temperature -> " + temperature + "°C");
    }
}
