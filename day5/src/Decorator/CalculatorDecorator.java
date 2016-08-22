package Decorator;

/**
 * Created by Марат on 22.08.2016.
 */
public class CalculatorDecorator implements Calculator {
    double x;
    double y;

    public CalculatorDecorator(double a, double b) {
        x = a;
        y = b;
    }

    @Override
    public void toAdd() {
        System.out.println(x + y);
    }
}
