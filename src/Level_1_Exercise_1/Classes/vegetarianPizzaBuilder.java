package Level_1_Exercise_1.Classes;

import Level_1_Exercise_1.Interface.PizzaBuilder;

public class vegetarianPizzaBuilder implements PizzaBuilder {
    protected Pizza pizza;

    @Override
    public void newPizza() {
        pizza=new Pizza();
    }

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void setDough(String dough) {
        pizza.setDough(dough);
    }

    @Override
    public void setToppings() {
        pizza.setToppings("Pepper, cheese and tomato");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}