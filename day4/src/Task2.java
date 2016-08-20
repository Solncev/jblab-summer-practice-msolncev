import java.util.Scanner;

/**
 * Created by Марат on 20.08.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int x : a) {
            switch (x % 2) {
                case 0:
                    System.out.println("c");
                    break;
                case 1:
                    System.out.println("n");
                    break;
            }
        }
    }
}
