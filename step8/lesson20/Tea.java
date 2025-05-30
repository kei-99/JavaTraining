import java.util.List;

public class Tea extends Beverage {
    private boolean iced; // アイスかどうか (あいす か どうか)
    private List<String> toppings; // トッピングのリスト (とっぴんぐ の りすと)

    public Tea(boolean iced, List<String> toppings) {
        this.iced = iced;
        this.toppings = toppings;
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea bag...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }

    @Override
    protected boolean isIced() {
        return iced;
    }

    @Override
    protected void addToppings() {
        if (toppings != null) {
            for (String topping : toppings) {
                System.out.println("Adding " + topping + "...");
            }
        }
    }
}
