package Decorator;

/**
 * Created by Марат on 22.08.2016.
 */
public class AnswerDecorator implements Calculator {
    Calculator calculator;

    public AnswerDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void toAdd() {
        System.out.print("Answer: ");
        calculator.toAdd();
    }
}
