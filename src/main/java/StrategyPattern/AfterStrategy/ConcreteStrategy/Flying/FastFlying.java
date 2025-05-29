package StrategyPattern.AfterStrategy.ConcreteStrategy.Flying;

import StrategyPattern.AfterStrategy.AbstractStrategy.FlyBehaviourStrategy;

public class FastFlying implements FlyBehaviourStrategy {
    @Override
    public void fly() {
        System.out.println("Duck is flying fastly...");
    }
}
