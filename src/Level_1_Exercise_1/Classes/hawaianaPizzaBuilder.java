package Level_1_Exercise_1.Classes;

import Level_1_Exercise_1.Interface.PizzaBuilder;

public class hawaianaPizzaBuilder implements PizzaBuilder {
    protected Pizza pizza;

    @Override
    public void newPizza() {
        pizza=new Pizza();
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
        pizza.setToppings("pineapple, cheese and tomato");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
