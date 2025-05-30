// ライトOFFコマンド（こまんど）
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light; // ライトを保存（ほぞん）
    }

    @Override
    public void execute() {
        light.turnOff(); // ライトをオフ
    }
}
