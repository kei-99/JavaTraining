import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making Iced Tea...");
        Beverage icedTea = new Tea(true, Arrays.asList("Mint", "Honey"));
        icedTea.prepareRecipe();

        System.out.println("\nMaking Hot Coffee...");
        Beverage hotCoffee = new Coffee(false, Collections.singletonList("Chocolate Syrup"));
        hotCoffee.prepareRecipe();

        System.out.println("\nMaking Tea with no toppings...");
        Beverage hotTea = new Tea(false, null);
        hotTea.prepareRecipe();
    }
}
