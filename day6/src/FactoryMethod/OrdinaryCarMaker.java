package FactoryMethod;

/**
 * Created by Марат on 23.08.2016.
 */
public class OrdinaryCarMaker implements CarMaker {
    @Override
    public Car createCar() {
        return new OrdinaryCar();
    }
}
