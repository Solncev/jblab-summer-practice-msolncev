import java.util.Scanner;

/**
 * Created by Марат on 18.08.2016.
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            a[i] = x * (1 + 2 * i);
            x *= -1;
        }
        for (int q : a) {
            System.out.println(q);
        }
    }
}
