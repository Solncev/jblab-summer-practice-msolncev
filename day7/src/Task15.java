import java.util.Scanner;

/**
 * Created by Марат on 24.08.2016.
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double s = 1;
        double p = 1;
        double q = 1;
        double f = 1;
        byte k = 1;
        final double e = 0.000001;
        for (int i = 1; q > e; i++) {
            p *= x * x;
            f *= (2 * i - 1) * (2 * i);
            k *= -1;
            q = k * p / f;
            s += q;
        }
        System.out.println(s);
    }
}
