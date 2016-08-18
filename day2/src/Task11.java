import java.util.Scanner;

/**
 * Created by Марат on 17.08.2016.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = 1;
        int p;
        for (int k = 1; k <= n; k++) {
            p = 4 * k * k;
            r = r * p / (p - 1);
        }
    }
}
