package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizza.BasePizza;
import DecoratorDesignPattern.BasePizza.FarmHouse;
import DecoratorDesignPattern.BasePizza.PanPizza;
import DecoratorDesignPattern.ToppingDecorator.ExtraCheese;
import DecoratorDesignPattern.ToppingDecorator.MushroomPizza;

public class MainDecorator
{
    public static void main(String[] args) {

        BasePizza basePizza = new MushroomPizza(new FarmHouse());
        System.out.println(basePizza.cost());

        BasePizza basePizza2 = new ExtraCheese(new PanPizza());
        System.out.println(basePizza2.cost());
    }
}
