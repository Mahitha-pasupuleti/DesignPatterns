package StrategyPattern.AfterStrategy.ConcreteStrategy.Flying;

import StrategyPattern.AfterStrategy.AbstractStrategy.FlyBehaviourStrategy;

public class SlowFlying implements FlyBehaviourStrategy {
    @Override
    public void fly() {
        System.out.println("Duck is flying slowly...");
    }
}
