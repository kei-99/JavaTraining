// リモコン（りもこん）クラス（invoker）
public class RemoteControl {
    private Command command; // コマンドの変数（へんすう）

    public void setCommand(Command command) {
        this.command = command; // コマンドを設定（せってい）
    }

    public void pressButton() {
        if (command != null) {
            command.execute(); // コマンド実行（じっこう）
        } else {
            System.out.println("No command assigned to this button."); // コマンドなし
        }
    }
}
