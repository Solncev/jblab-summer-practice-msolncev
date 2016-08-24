import java.util.Scanner;

/**
 * Created by Марат on 23.08.2016.
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long p = 1;
        long q = 2;
        double s = 0.5;
        for (int i = 2; i < n + 1; i++) {
            p *= (i - 1);
            q *= (2 * i - 1) * (2 * i);
            System.out.println((double) p * p / q);
            s += (double) p * p / q;
        }
        System.out.println(s);
    }
}
