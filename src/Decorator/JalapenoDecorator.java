package Decorator;

import Base.BasePizza;

public class JalapenoDecorator extends ToppingDecorator {
    public JalapenoDecorator(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
