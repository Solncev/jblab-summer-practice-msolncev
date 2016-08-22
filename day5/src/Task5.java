import java.util.Scanner;

/**
 * Created by Марат on 22.08.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double d = x > 6 ? (x * x - 1) / (3 * x + 5) : (Math.pow(1 + x, 3)) / (x - 7) + 2;
        System.out.println(d);
    }
}
