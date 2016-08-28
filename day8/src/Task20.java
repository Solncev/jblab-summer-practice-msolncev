import java.util.Scanner;

/**
 * Created by Марат on 26.08.2016.
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int c;
        for (int i = 0; i < n / 2; i++) {
            c = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = c;
        }
        for (int x : a) {
            System.out.println(x);
        }
    }
}
