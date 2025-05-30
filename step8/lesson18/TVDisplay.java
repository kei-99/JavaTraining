// テレビの表示（ひょうじ）クラス
public class TVDisplay implements TemperatureObserver {
    @Override
    public void update(float temperature) {
        System.out.println("TV Display: Temperature=" + temperature + "°C");
    }
}
