import java.util.Scanner;

/**
 * Created by Марат on 19.08.2016.
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = b[a[i]];
        }
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
