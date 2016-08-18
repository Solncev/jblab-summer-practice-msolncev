/**
 * Created by Марат on 17.08.2016.
 */
public class Task8 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(args[i + 1]);
        }
        int m = Integer.valueOf(args[n + 1]);
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.valueOf(args[i + n + 2]);
        }
        if (n > m) {
            for (int i = 0; i < m; i++) {
                a[i] += b[i];
            }
            for (int x : a) {
                System.out.print(x + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                b[i] += a[i];
            }
            for (int x : b) {
                System.out.print(x + " ");
            }
        }

    }
}
