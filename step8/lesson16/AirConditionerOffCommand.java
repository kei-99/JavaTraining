// エアコンOFFコマンド（こまんど）
public class AirConditionerOffCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner; // エアコンを保存（ほぞん）
    }

    @Override
    public void execute() {
        airConditioner.turnOff(); // エアコンをオフ
    }
}
