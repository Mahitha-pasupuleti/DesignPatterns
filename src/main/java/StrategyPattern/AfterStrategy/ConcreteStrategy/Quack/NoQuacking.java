package StrategyPattern.AfterStrategy.ConcreteStrategy.Quack;

import StrategyPattern.AfterStrategy.AbstractStrategy.QuackBehaviourStrategy;

public class NoQuacking implements QuackBehaviourStrategy {
    @Override
    public void quack() {
        System.out.println("Duck can't quack...");
    }
}
