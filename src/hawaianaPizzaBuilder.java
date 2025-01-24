public class hawaianaPizzaBuilder implements PizzaBuilder{
    protected Pizza pizza;

    @Override
    public void setSize() {
        pizza.setSize("median");
    }

    @Override
    public void setDough() {
        pizza.setDough("fine");
    }

    @Override
    public void setToppings() {
        pizza.setToppings("pineapple, cheese and tomato");
    }
}
