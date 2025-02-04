package Level_1_Exercise_1.Interface;

import Level_1_Exercise_1.Classes.Pizza;

import java.util.ArrayList;

public interface PizzaBuilder {
    public void newPizza();

    public void setSize(String size);

    public void setDough(String dough);

    public void setToppings(ArrayList<String> toppings);

    public Pizza getPizza();

}