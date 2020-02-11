package safari.hfdp.strategy_pattern.sim_duck;

import safari.hfdp.strategy_pattern.sim_duck.behavior.FlyWithWings;
import safari.hfdp.strategy_pattern.sim_duck.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
