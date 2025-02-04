package Level_1_Exercise_1.Classes;
import java.util.ArrayList;
public class Pizza {
    private String size;
    private String dough;
    private ArrayList<String> toppings;
    public void setSize(String size) {this.size = size;}
    public void setDough(String dough) {
        this.dough = dough;
    }
    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

