public class vegetarianPizzaBuilder implements PizzaBuilder{
    protected Pizza pizza;

    @Override
    public void newPizza() {
        pizza=newPizza();
    }

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
        pizza.setToppings("Pepper, cheese and tomato");
    }
}