// クライアントコード（main）
public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(); // リモコン作成（さくせい）

        // 家電作成（かでんさくせい）
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();

        // コマンド作成（さくせい）
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command acOn = new AirConditionerOnCommand(airConditioner);
        Command acOff = new AirConditionerOffCommand(airConditioner);

        // コマンドを設定（せってい）してボタンを押（お）す
        remote.setCommand(lightOn);
        remote.pressButton(); // Turning on the light...

        remote.setCommand(lightOff);
        remote.pressButton(); // Turning off the light...

        remote.setCommand(acOn);
        remote.pressButton(); // Turning on the air conditioner...

        remote.setCommand(acOff);
        remote.pressButton(); // Turning off the air conditioner...
    }
}
