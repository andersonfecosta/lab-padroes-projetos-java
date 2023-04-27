package gof.strategy;

public class BehaviorDefensivo implements Behavior{
    @Override
    public void move() {
        System.out.println("Movendo-se defensivamente...");
    }
}
