import java.util.Scanner;

/**
 * Created by Марат on 22.08.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        double s = 0;
        for (int i = 1; i < m + 1; i++) {
            double p = 1;
            for (int j = 1; j < n + 1; j++) {
                p *= ((double) (i + j) / (i * j));
            }
            s += p;
        }
        System.out.println(s);
    }
}
