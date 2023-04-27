package gof.strategy;

public class BehaviorAgressivo implements Behavior{
    @Override
    public void move() {
        System.out.println("Movendo-se agressivamente...");
    }
}
