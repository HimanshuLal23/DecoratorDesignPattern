package Decorator;

import Base.BasePizza;

public class CapsicumDecorator extends ToppingDecorator {
    BasePizza basePizza;
    public CapsicumDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    /**
     * @return the cost of decoration
     */
    @Override
    public int cost() {
        return basePizza.cost()+25;
    }
}
