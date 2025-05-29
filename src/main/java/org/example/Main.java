package org.example;

import StrategyPattern.AfterStrategy.AbstractStrategy.DisplayBehaviourStrategy;
import StrategyPattern.AfterStrategy.AbstractStrategy.FlyBehaviourStrategy;
import StrategyPattern.AfterStrategy.AbstractStrategy.QuackBehaviourStrategy;
import StrategyPattern.AfterStrategy.ConcreteStrategy.Display.PictureDisplay;
import StrategyPattern.AfterStrategy.ConcreteStrategy.Flying.FastFlying;
import StrategyPattern.AfterStrategy.ConcreteStrategy.Quack.CuteQuacking;
import StrategyPattern.AfterStrategy.Duck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DisplayBehaviourStrategy pictureDisplay = new PictureDisplay();
        FlyBehaviourStrategy fastFlying = new FastFlying();
        QuackBehaviourStrategy cuteQuacking = new CuteQuacking();

        Duck mountainDuck = new Duck(pictureDisplay, fastFlying, cuteQuacking);
        mountainDuck.display();
        mountainDuck.fly();
        mountainDuck.quack();
    }
}