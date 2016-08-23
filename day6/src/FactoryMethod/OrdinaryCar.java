package FactoryMethod;

/**
 * Created by Марат on 23.08.2016.
 */
public class OrdinaryCar implements Car {
    @Override
    public void go() {
        System.out.println("your speed 60 mph");
    }
}
