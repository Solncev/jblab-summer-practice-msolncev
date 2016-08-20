import java.util.Scanner;

/**
 * Created by Марат on 20.08.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("x" + i + " = ");
            x[i] = scanner.nextInt();
            System.out.print("y" + i + " = ");
            y[i] = scanner.nextInt();
        }
        boolean b = true;
        for (int i = 0; i < n - 2 && b; i++) {
            b = (((x[i + 2] - x[i]) / (x[i + 1] - x[i])) == ((y[i + 2] - y[i]) / (y[i + 1] - y[i])));
        }
        System.out.println(b);
    }
}
