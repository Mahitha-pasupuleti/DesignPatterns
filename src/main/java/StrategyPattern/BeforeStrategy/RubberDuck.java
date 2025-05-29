package StrategyPattern.BeforeStrategy;

public class RubberDuck extends Duck {
    public void fly() {
        System.out.println("Duck can't fly");
    }
    public void quack() {
        System.out.println("Duck can't quack");
    }
}
