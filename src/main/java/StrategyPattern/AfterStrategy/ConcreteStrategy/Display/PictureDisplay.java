package StrategyPattern.AfterStrategy.ConcreteStrategy.Display;

import StrategyPattern.AfterStrategy.AbstractStrategy.DisplayBehaviourStrategy;

public class PictureDisplay implements DisplayBehaviourStrategy {
    @Override
    public void display() {
        System.out.println("Display duck as a picture...");
    }
}
