import java.util.Scanner;

/**
 * Created by Марат on 24.08.2016.
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            s += a[i];
        }
        System.out.println("average = " + ((double) s / n));
    }
}
