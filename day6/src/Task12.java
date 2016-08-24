import java.util.Scanner;

/**
 * Created by Марат on 23.08.2016.
 */
public class Task12 {
    public static void main(String[] args) {
        long s = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        long p = 1;
        for (int i = 1; i < n + 1; i++) {
            p *= (x + i);
            s += p;
        }
        System.out.println(s);
    }
}
