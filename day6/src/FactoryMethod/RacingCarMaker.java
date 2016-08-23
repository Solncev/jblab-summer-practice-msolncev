package FactoryMethod;

/**
 * Created by Марат on 23.08.2016.
 */
public class RacingCarMaker implements CarMaker {
    @Override
    public Car createCar() {
        return new RacingCar();
    }
}
