import java.util.Scanner;

/**
 * Created by Марат on 18.08.2016.
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int s = 0;
        int a = 1;
        while (x > 0) {
            s += a * x % 10;
            x /= 10;
            a *= -1;
        }
        System.out.println(s);
    }
}
