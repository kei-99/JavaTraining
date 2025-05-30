import java.util.List;

public class Coffee extends Beverage {
    private boolean iced;
    private List<String> toppings;

    public Coffee(boolean iced, List<String> toppings) {
        this.iced = iced;
        this.toppings = toppings;
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
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
