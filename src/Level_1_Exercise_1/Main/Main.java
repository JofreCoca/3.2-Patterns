package Level_1_Exercise_1.Main;

import Level_1_Exercise_1.Classes.MestrePizzer;
import Level_1_Exercise_1.Classes.Pizza;
import Level_1_Exercise_1.Classes.HawaianaPizzaBuilder;
import Level_1_Exercise_1.Classes.VegetarianPizzaBuilder;
import Level_1_Exercise_1.Interface.PizzaBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MestrePizzer metrePizzer = new MestrePizzer(); // Director

        PizzaBuilder hawaiPizzaBuilder = new HawaianaPizzaBuilder();
        PizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();

        metrePizzer.setPizzaBuilder(hawaiPizzaBuilder);
        metrePizzer.construirPizza("median","fine", new ArrayList<>(Arrays.asList("pineapple","cheese and tomato")));

        Pizza pizza = metrePizzer.getPizza();
        System.out.println(pizza);

        metrePizzer.setPizzaBuilder(vegetarianPizzaBuilder);
        metrePizzer.construirPizza("small","gross", new ArrayList<>(Arrays.asList("Pepper, cheese and tomato")));
        pizza = metrePizzer.getPizza();
        System.out.println(pizza);
    }
}