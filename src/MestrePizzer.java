public class MestrePizzer {
    private PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        builder = pizzaBuilder;
    }

    public void construirPizza() {
        builder.newPizza();
        builder.setSize();
        builder.setDough();
        builder.setToppings();
    }
}
