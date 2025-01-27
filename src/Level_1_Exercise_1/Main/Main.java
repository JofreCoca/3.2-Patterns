package Level_1_Exercise_1.Main;

import Level_1_Exercise_1.Classes.MestrePizzer;
import Level_1_Exercise_1.Classes.Pizza;
import Level_1_Exercise_1.Classes.hawaianaPizzaBuilder;
import Level_1_Exercise_1.Classes.vegetarianPizzaBuilder;
import Level_1_Exercise_1.Interface.PizzaBuilder;

public class Main {
    public static void main(String[] args) {

        MestrePizzer metrePizzer = new MestrePizzer(); // Director

        PizzaBuilder hawaiPizzaBuilder = new hawaianaPizzaBuilder();
        PizzaBuilder vegetarianPizzaBuilder = new vegetarianPizzaBuilder();

        metrePizzer.setPizzaBuilder(hawaiPizzaBuilder);
        metrePizzer.construirPizza();
        Pizza pizza = metrePizzer.getPizza();
        System.out.println(pizza);

        metrePizzer.setPizzaBuilder(vegetarianPizzaBuilder);
        metrePizzer.construirPizza();
        pizza = metrePizzer.getPizza();
        System.out.println(pizza);
    }
}