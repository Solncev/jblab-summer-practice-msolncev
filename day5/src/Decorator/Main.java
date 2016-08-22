package Decorator;

/**
 * Created by Марат on 22.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Calculator c = new AnswerDecorator(new CalculatorDecorator(1.5, 2.0));
        c.toAdd();
    }
}
