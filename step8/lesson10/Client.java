// ライト制御（せいぎょ）
class LightSystem {
    public void turnOn() {
        System.out.println("ライトをオンにしました。");
    }

    public void turnOff() {
        System.out.println("ライトをオフにしました。");
    }
}

// エアコン制御（せいぎょ）
class AirConditionerSystem {
    public void turnOn() {
        System.out.println("エアコンをオンにしました。");
    }

    public void turnOff() {
        System.out.println("エアコンをオフにしました。");
    }
}

// ドアロック制御（せいぎょ）
class DoorLockSystem {
    public void lock() {
        System.out.println("ドアをロックしました。");
    }

    public void unlock() {
        System.out.println("ドアのロックを解除（かいじょ）しました。");
    }
}

// ファサードクラス：スマートホーム
class SmartHomeFacade {
    private LightSystem lightSystem;
    private AirConditionerSystem airConditionerSystem;
    private DoorLockSystem doorLockSystem;

    public SmartHomeFacade() {
        this.lightSystem = new LightSystem();
        this.airConditionerSystem = new AirConditionerSystem();
        this.doorLockSystem = new DoorLockSystem();
    }

    // お出かけモード
    public void awayMode() {
        System.out.println("お出かけモードを開始（かいし）します...");
        lightSystem.turnOff();
        airConditionerSystem.turnOff();
        doorLockSystem.lock();
        System.out.println("お出かけモードが完了（かんりょう）しました。\n");
    }

    // 帰宅（きたく）モード
    public void homeMode() {
        System.out.println("帰宅モードを開始します...");
        doorLockSystem.unlock();
        lightSystem.turnOn();
        airConditionerSystem.turnOn();
        System.out.println("帰宅モードが完了しました。\n");
    }
}

// クライアントコード
public class Client {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        // お出かけモード
        smartHome.awayMode();

        // 帰宅モード
        smartHome.homeMode();
    }
}
