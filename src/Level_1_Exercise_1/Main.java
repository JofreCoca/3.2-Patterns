package Level_1_Exercise_1;

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