package safari.hfdp.strategy_pattern.sim_duck.behavior;

public class NoQuack implements QuackBehavior{
    public void quack() {
        System.out.println("Silence");
    }
}
