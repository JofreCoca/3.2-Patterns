package Level_1_Exercise_1.Classes;
import Level_1_Exercise_1.Interface.PizzaBuilder;
import java.util.ArrayList;

public class MestrePizzer {
    private PizzaBuilder builder;
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        builder = pizzaBuilder;
    }
    public void construirPizza(String size, String dought, ArrayList<String> toppings) {
        builder.newPizza();
        builder.setSize(size);
        builder.setDough(dought);
        builder.setToppings(toppings);
    }
    public Pizza getPizza() {
        return builder.getPizza();
    }
}
