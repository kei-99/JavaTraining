// スマートフォンの表示（ひょうじ）クラス
public class SmartphoneDisplay implements TemperatureObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Smartphone Display: Temperature=" + temperature + "°C");
    }
}
