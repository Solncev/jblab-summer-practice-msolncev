import java.util.Scanner;

/**
 * Created by Марат on 24.08.2016.
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        a[0] = scanner.nextInt();
        int max = a[0];
        int min = a[0];
        int minp = 0;
        int maxp = 0;
        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > max) {
                max = a[i];
                maxp = i;
            }
            if (a[i] < min) {
                min = a[i];
                minp = i;
            }
        }
        int c = a[minp];
        a[minp] = a[maxp];
        a[maxp] = c;
        for (int x : a) {
            System.out.println(x);
        }
    }
}
