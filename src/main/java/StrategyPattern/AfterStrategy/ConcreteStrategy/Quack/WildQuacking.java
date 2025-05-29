package StrategyPattern.AfterStrategy.ConcreteStrategy.Quack;

import StrategyPattern.AfterStrategy.AbstractStrategy.QuackBehaviourStrategy;

public class WildQuacking implements QuackBehaviourStrategy {
    @Override
    public void quack() {
        System.out.println("Duck is quacking wildly...");
    }
}
