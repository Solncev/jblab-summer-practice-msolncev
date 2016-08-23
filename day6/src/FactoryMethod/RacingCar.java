package FactoryMethod;

/**
 * Created by Марат on 23.08.2016.
 */
public class RacingCar implements Car {
    @Override
    public void go() {
        System.out.println("your speed 250 mph");
    }
}
