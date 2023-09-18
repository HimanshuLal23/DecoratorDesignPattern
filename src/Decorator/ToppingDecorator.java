package Decorator;

import Base.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza basePizza;
    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
