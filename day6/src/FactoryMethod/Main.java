package FactoryMethod;

/**
 * Created by Марат on 23.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        CarMaker a = new RacingCarMaker();
        Car x = a.createCar();
        x.go();
    }
}
