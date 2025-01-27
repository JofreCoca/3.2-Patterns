package Level_1_Exercise_1.Interface;

import Level_1_Exercise_1.Classes.Pizza;

public interface PizzaBuilder {
    public void newPizza();
    public void setSize();
    public void setDough();
    public void setToppings();
    public Pizza getPizza();
}
