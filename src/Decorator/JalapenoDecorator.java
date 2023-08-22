package Decorator;

import Base.BasePizza;

public class JalapenoDecorator extends ToppingDecorator {
    BasePizza basePizza;
    public JalapenoDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
