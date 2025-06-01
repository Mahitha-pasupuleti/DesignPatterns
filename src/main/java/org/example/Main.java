package org.example;

// Importing Observer pattern classes for weather and news observables and observers
import DecoratorPattern.Component.BeverageComponent;
import DecoratorPattern.Component.CafeLatteBeverageComponent;
import DecoratorPattern.Component.ExpressoBeverageComponent;
import DecoratorPattern.Decorator.AlmondMilkAddOnDecorator;
import DecoratorPattern.Decorator.CaramelAddOnDecorator;
import DecoratorPattern.Decorator.ChocolateAddOnDecorator;
import DecoratorPattern.Decorator.SugarSyrupAddOnDecorator;
import ObserverPattern.WithConstructorInjection.Observable.News.NewsStationObservable;
import ObserverPattern.WithConstructorInjection.Observable.News.NewsStationObservableImpl;
import ObserverPattern.WithConstructorInjection.Observable.Wearther.WeatherStationObservable;
import ObserverPattern.WithConstructorInjection.Observable.Wearther.WeatherStationObservableImpl;
import ObserverPattern.WithConstructorInjection.Observer.MobileObserverImpl;
import ObserverPattern.WithConstructorInjection.Observer.TvDisplayObserverImpl;

// Importing Strategy pattern abstract strategy interfaces and concrete implementations
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

        // Demonstrating the Strategy Pattern
        System.out.println("..........");
        System.out.println("### Strategy Pattern ###");
        System.out.println("..........");

        // Create specific behavior strategy instances
        DisplayBehaviourStrategy pictureDisplay = new PictureDisplay();
        FlyBehaviourStrategy fastFlying = new FastFlying();
        QuackBehaviourStrategy cuteQuacking = new CuteQuacking();

        // Create a Duck object with the chosen strategies injected
        Duck mountainDuck = new Duck(pictureDisplay, fastFlying, cuteQuacking);

        // Perform actions using the chosen strategies
        mountainDuck.display();   // Displays the duck (using picture display)
        mountainDuck.fly();       // Duck flies fast
        mountainDuck.quack();     // Duck quacks cutely

        // Demonstrating the Observer Pattern
        System.out.println("..........");
        System.out.println("### Observer Pattern ###");
        System.out.println("..........");

        // Create observables for weather and news stations
        WeatherStationObservable weatherStationObservable = new WeatherStationObservableImpl();
        NewsStationObservable newsStationObservable = new NewsStationObservableImpl();

        // Create observers that listen to weather updates
        MobileObserverImpl mobileDevice = new MobileObserverImpl(weatherStationObservable);
        // Register mobile device observer to weather station
        weatherStationObservable.addObserver(mobileDevice);

        // Create TV display observer that listens to both weather and news updates
        TvDisplayObserverImpl tvDisplay = new TvDisplayObserverImpl(weatherStationObservable, newsStationObservable);
        // Register TV display to both weather and news stations
        weatherStationObservable.addObserver(tvDisplay);
        newsStationObservable.addObserver(tvDisplay);

        // Simulate broadcasting weather updates
        System.out.println("..........");
        System.out.println("Weather broadcast");
        System.out.println("..........");

        // Update temperature and notify observers
        weatherStationObservable.setTemperature(45);
        System.out.println("..........");
        weatherStationObservable.setTemperature(50);
        System.out.println("..........");

        // Update breaking news and notify observers
        newsStationObservable.setBreakingNews("Extreme rain in California Blvd county");

        // Demonstrating the Decorator Pattern
        System.out.println("..........");
        System.out.println("### Decorator Pattern ###");
        System.out.println("..........");

// Creating an Expresso beverage with Sugar Syrup and Almond Milk add-ons
        BeverageComponent expresso = new AlmondMilkAddOnDecorator(
                new SugarSyrupAddOnDecorator(
                        new ExpressoBeverageComponent()));
        System.out.println(expresso.name()); // Outputs the name with all applied add-ons
        System.out.println("Cost of beverage is " + expresso.cost()); // Outputs total cost
        System.out.println("..........");

// Creating a Cafe Latte beverage with Caramel and Chocolate add-ons
        BeverageComponent cafeLatte = new ChocolateAddOnDecorator(
                new CaramelAddOnDecorator(
                        new CafeLatteBeverageComponent()));
        System.out.println(cafeLatte.name()); // Outputs the name with all applied add-ons
        System.out.println("Cost of beverage is " + cafeLatte.cost()); // Outputs total cost


    }
}
