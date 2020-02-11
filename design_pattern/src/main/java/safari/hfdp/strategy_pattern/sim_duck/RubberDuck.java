package safari.hfdp.strategy_pattern.sim_duck;

import safari.hfdp.strategy_pattern.sim_duck.behavior.FlyNoWay;
import safari.hfdp.strategy_pattern.sim_duck.behavior.NoQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new NoQuack();
    }

    public void display() {
        System.out.println("This is Rubber Duck");
    }
}
