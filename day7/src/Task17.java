import java.util.Scanner;

/**
 * Created by Марат on 24.08.2016.
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        a[0] = scanner.nextInt();
        int min = a[0];
        int max = a[0];
        int kmin = 0;
        int kmax = 0;
        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > max) {
                max = a[i];
                kmax = 1;
            } else if (a[i] == max) {
                kmax++;
            }
            if (a[i] < min) {
                min = a[i];
                kmin = 1;
            } else if (a[i] == min) {
                kmin++;
            }
        }
        if (a[0] == max) {
            kmax++;
        }
        if (a[0] == min) {
            kmin++;
        }
        System.out.println("min amount = " + kmin);
        System.out.println("max amount = " + kmax);
    }
}
