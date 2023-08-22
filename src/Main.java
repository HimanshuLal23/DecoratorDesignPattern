import Base.BasePizza;
import Base.MushroomDelightPizza;
import Decorator.CapsicumDecorator;
import Decorator.JalapenoDecorator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new JalapenoDecorator(new MushroomDelightPizza());
        System.out.println(basePizza.cost());
    }
}