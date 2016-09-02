import java.util.Scanner;

/**
 * Created by Марат on 29.08.2016.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        double r = 1;
        for (int i = 0; i < l; i++) {
            double s = 0;
            for (int j = 0; j < m; j++) {
                double p = 1;
                for (int k = 0; k < n; k++) {
                    p *= Math.exp(i * j * k) / (Math.cos(i) + Math.sin(j) + Math.tan(k));
                }
                s += p;
            }
            r *= s;
        }
        System.out.println("result = " + r);
    }
}
