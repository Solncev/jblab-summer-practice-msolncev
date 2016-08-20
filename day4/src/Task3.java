import java.util.Scanner;

/**
 * Created by Марат on 20.08.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int x : a) {
            int c = x > 0 ? 1 : -1;
            switch (c) {
                case 1:
                    System.out.println("+");
                    break;
                case -1:
                    System.out.println("-");
                    break;
            }
        }
    }
}
