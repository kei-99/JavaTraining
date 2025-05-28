//  ピザクラス
class Pizza {
    // 🔸 必須（ひっす）こうもく
    private String size;       // サイズ（Small, Medium, Large）
    private String crust;      // 生地の種類（Thin Crust, Thick Crust）
    // 🔹 オプション
    private boolean cheese;    // チーズ
    private boolean pepperoni; // ペパロニ
    private boolean olives;    // オリーブ

    //  コンストラクタは外（そと）から呼（よ）べない（Builderだけ使う）
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
    }

    //  ピザの内容（ないよう）を文字列（もじれつ）で返（かえ）す
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust +
               ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", olives=" + olives + "]";
    }

    //  ビルダー内部（ないぶ）クラス
    public static class PizzaBuilder {
        private String size;
        private String crust;
        private boolean cheese;
        private boolean pepperoni;
        private boolean olives;

        //  必須こうもくをコンストラクタで指定（してい）
        public PizzaBuilder(String size, String crust) {
            this.size = size;
            this.crust = crust;
        }

        //  オプション設定（せってい）
        public PizzaBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder addOlives(boolean olives) {
            this.olives = olives;
            return this;
        }

        //  最後（さいご）にピザを完成（かんせい）させる
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

// クライアントコード（テスト）
public class Client {
    public static void main(String[] args) {
        //  チーズ入りのシンプルピザ
        Pizza simplePizza = new Pizza.PizzaBuilder("Medium", "Thin Crust")
                                     .addCheese(true)
                                     .build();

        //  ペパロニとオリーブ入りのカスタムピザ
        Pizza customPizza = new Pizza.PizzaBuilder("Large", "Thick Crust")
                                      .addCheese(true)
                                      .addPepperoni(true)
                                      .addOlives(true)
                                      .build();

        // サイズと生地だけの基本（きほん）ピザ
        Pizza basicPizza = new Pizza.PizzaBuilder("Small", "Thin Crust")
                                    .build();

        //  ピザの中身（なかみ）を表示（ひょうじ）
        System.out.println(simplePizza);
        System.out.println(customPizza);
        System.out.println(basicPizza);
    }
}
