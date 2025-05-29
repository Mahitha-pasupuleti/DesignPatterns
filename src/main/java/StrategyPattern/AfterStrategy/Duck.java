package StrategyPattern.AfterStrategy;

import StrategyPattern.AfterStrategy.AbstractStrategy.DisplayBehaviourStrategy;
import StrategyPattern.AfterStrategy.AbstractStrategy.FlyBehaviourStrategy;
import StrategyPattern.AfterStrategy.AbstractStrategy.QuackBehaviourStrategy;

public class Duck {

    DisplayBehaviourStrategy displayBehaviourStrategy;
    FlyBehaviourStrategy flyBehaviourStrategy;
    QuackBehaviourStrategy quackBehaviourStrategy;

    public Duck(
            DisplayBehaviourStrategy displayBehaviourStrategy,
            FlyBehaviourStrategy flyBehaviourStrategy,
            QuackBehaviourStrategy quackBehaviourStrategy
            ) {
        this.displayBehaviourStrategy = displayBehaviourStrategy;
        this.flyBehaviourStrategy = flyBehaviourStrategy;
        this.quackBehaviourStrategy = quackBehaviourStrategy;
    }

    public void display() {
        this.displayBehaviourStrategy.display();
    }

    public void fly() {
        this.flyBehaviourStrategy.fly();
    }

    public void quack() {
        this.quackBehaviourStrategy.quack();
    }

}
