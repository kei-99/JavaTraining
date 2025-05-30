// エアコンONコマンド（こまんど）
public class AirConditionerOnCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner; // エアコンを保存（ほぞん）
    }

    @Override
    public void execute() {
        airConditioner.turnOn(); // エアコンをオン
    }
}
