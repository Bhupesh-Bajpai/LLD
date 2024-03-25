package DecoratorDesignPattern.ToppingDecorator;

import DecoratorDesignPattern.BasePizza.BasePizza;

public class MushroomPizza extends ToppingSection{

    BasePizza basePizza;
    public MushroomPizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
