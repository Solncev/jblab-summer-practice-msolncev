import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Марат on 29.08.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        System.out.println(set.size());
    }
}
