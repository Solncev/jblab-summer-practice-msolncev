import java.util.Scanner;

/**
 * Created by Марат on 23.08.2016.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = scanner.nextInt();
        double q = (x + n);
        for (int i = n - 1; i > 0; i--) {
            q = i + x / q;
        }
        System.out.println(q);
    }
}
