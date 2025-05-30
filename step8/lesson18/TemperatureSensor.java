import java.util.ArrayList;
import java.util.List;

// 温度センサー（おんどせんさー）クラス（観察対象：かんさつたいしょう）
public class TemperatureSensor {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private float temperature; // 現在（げんざい）の温度（おんど）

    // オブザーバー登録（とうろく）
    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    // オブザーバー削除（さくじょ）
    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    // オブザーバー全員（ぜんいん）に通知（つうち）
    public void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }

    // 温度を設定（せってい）し、通知（つうち）
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("\nTemperature updated: " + temperature + "°C");
        notifyObservers();
    }
}
