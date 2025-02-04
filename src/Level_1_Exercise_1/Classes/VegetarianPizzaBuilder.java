package Level_1_Exercise_1.Classes;

import Level_1_Exercise_1.Interface.PizzaBuilder;

import java.util.ArrayList;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    protected Pizza pizza;

    @Override
    public void newPizza() {pizza=new Builder().getPizza();}

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void setDough(String dough) {
        pizza.setDough(dough);
    }

    @Override
    public void setToppings(ArrayList<String> toppings) {pizza.setToppings(toppings);}

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}