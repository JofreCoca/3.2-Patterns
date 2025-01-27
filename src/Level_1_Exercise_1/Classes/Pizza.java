package Level_1_Exercise_1.Classes;

public class Pizza {
    private String size;
    private String dough;
    private String toppings;
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
    public void setDough(String dough) {
        this.dough = dough;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
