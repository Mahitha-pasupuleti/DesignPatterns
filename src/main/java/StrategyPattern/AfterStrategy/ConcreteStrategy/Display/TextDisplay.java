package StrategyPattern.AfterStrategy.ConcreteStrategy.Display;

import StrategyPattern.AfterStrategy.AbstractStrategy.DisplayBehaviourStrategy;

public class TextDisplay implements DisplayBehaviourStrategy {
    @Override
    public void display() {
        System.out.println("Display duck as a text...");
    }
}
