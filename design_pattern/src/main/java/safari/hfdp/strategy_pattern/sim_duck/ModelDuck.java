package safari.hfdp.strategy_pattern.sim_duck;

import safari.hfdp.strategy_pattern.sim_duck.behavior.FlyNoWay;
import safari.hfdp.strategy_pattern.sim_duck.behavior.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }
}
