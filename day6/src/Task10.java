import java.util.Scanner;

/**
 * Created by Марат on 23.08.2016.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long f = 1;
        if (n % 2 == 1) {
            for (int i = 1; i < n + 1; i += 2) {
                f *= i;
            }
        } else {
            for (int i = 2; i < n + 1; i += 2) {
                f *= i;
            }
        }
        System.out.println(f);
    }
}
