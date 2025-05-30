// ライトONコマンド（こまんど）
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light; // ライトを保存（ほぞん）
    }

    @Override
    public void execute() {
        light.turnOn(); // ライトをオン
    }
}
