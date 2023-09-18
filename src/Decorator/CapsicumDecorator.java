package Decorator;

import Base.BasePizza;

public class CapsicumDecorator extends ToppingDecorator {
    public CapsicumDecorator(BasePizza basePizza) {
        super(basePizza);
    }
    /**
     * @return the cost of decoration
     */
    @Override
    public int cost() {
        return basePizza.cost()+25;
    }
}
