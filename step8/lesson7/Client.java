// Step 1: Abstract Products（抽象製品（ちゅうしょうせいひん））

// コーヒー用（よう）のインターフェース（共通（きょうつう）の動作（どうさ））
interface Coffee {
    void prepare(); // 準備（じゅんび）メソッド
}

// ティー用（よう）のインターフェース
interface Tea {
    void prepare(); // 準備（じゅんび）メソッド
}


// Step 2: Concrete Products（具体製品（ぐたいてきせいひん））

// ホットコーヒーのクラス（Coffeeインターフェースを実装（じっそう））
class HotCoffee implements Coffee {
    public void prepare() {
        System.out.println("ホットコーヒーを準備中（じゅんびちゅう）...");
    }
}

// アイスコーヒーのクラス
class IcedCoffee implements Coffee {
    public void prepare() {
        System.out.println("アイスコーヒーを準備中（じゅんびちゅう）...");
    }
}

// ホットティーのクラス（Teaインターフェースを実装）
class HotTea implements Tea {
    public void prepare() {
        System.out.println("ホットティーを準備中（じゅんびちゅう）...");
    }
}

// アイスティーのクラス
class IcedTea implements Tea {
    public void prepare() {
        System.out.println("アイスティーを準備中（じゅんびちゅう）...");
    }
}


// Step 3: Abstract Factory（抽象工場（ちゅうしょうこうじょう））

// 飲（の）み物を作（つく）るための共通（きょうつう）の工場（こうじょう）インターフェース
interface DrinkFactory {
    Coffee createCoffee(); // コーヒーを作（つく）る
    Tea createTea();       // ティーを作（つく）る
}


// Step 4: Concrete Factories（具体工場（ぐたいてきこうじょう））

// ホットドリンク用（よう）の工場（こうじょう）
class HotDrinkFactory implements DrinkFactory {
    public Coffee createCoffee() {
        return new HotCoffee(); // ホットコーヒーを作（つく）る
    }

    public Tea createTea() {
        return new HotTea();    // ホットティーを作（つく）る
    }
}

// コールドドリンク用の工場
class ColdDrinkFactory implements DrinkFactory {
    public Coffee createCoffee() {
        return new IcedCoffee(); // アイスコーヒーを作（つく）る
    }

    public Tea createTea() {
        return new IcedTea();    // アイスティーを作（つく）る
    }
}


// Step 5: Client Code（クライアントコード：実行部（じっこうぶ））

public class Client {
    public static void main(String[] args) {
        // ホットドリンクの工場（こうじょう）を使（つか）う
        DrinkFactory hotFactory = new HotDrinkFactory();
        Coffee hotCoffee = hotFactory.createCoffee(); // ホットコーヒーを作成（さくせい）
        Tea hotTea = hotFactory.createTea();          // ホットティーを作成

        hotCoffee.prepare(); // ホットコーヒーを準備中（じゅんびちゅう）...
        hotTea.prepare();    // ホットティーを準備中...

        // コールドドリンクの工場を使う
        DrinkFactory coldFactory = new ColdDrinkFactory();
        Coffee icedCoffee = coldFactory.createCoffee(); // アイスコーヒーを作成
        Tea icedTea = coldFactory.createTea();          // アイスティーを作成

        icedCoffee.prepare(); // アイスコーヒーを準備中（じゅんびちゅう）...
        icedTea.prepare();    // アイスティーを準備中...
    }
}
