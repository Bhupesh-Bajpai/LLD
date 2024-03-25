package DecoratorDesignPattern.ToppingDecorator;

import DecoratorDesignPattern.BasePizza.BasePizza;
import ObserverDesignPattern.Observer.EmailAlertObserver;

public class ExtraCheese extends ToppingSection{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+50;
    }


}
