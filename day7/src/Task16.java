import java.util.Scanner;

/**
 * Created by Марат on 24.08.2016.
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double e = 0.000001;
        double x = scanner.nextDouble();
        double s = 0;
        long q = 2;
        long p = 1;
        double k = x * x;
        double l = 1;
        for (int i = 2; l > e; i++) {
            p *= (2 * i - 1);
            q *= (2 * i);
            k *= x * x;
            l = k * p / q;
            s += l;
        }
        System.out.println(s);
    }
}
