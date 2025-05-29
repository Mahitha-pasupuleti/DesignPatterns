package StrategyPattern.AfterStrategy.ConcreteStrategy.Flying;

import StrategyPattern.AfterStrategy.AbstractStrategy.FlyBehaviourStrategy;

public class NoFlying implements FlyBehaviourStrategy {
    @Override
    public void fly() {
        System.out.println("Duck can't fly...");
    }
}
