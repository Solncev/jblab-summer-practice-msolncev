import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Марат on 29.08.2016.
 */
public class Task5 {
    public static int compare(String a, String b) {
        if (a.equals(b)) {
            return 0;
        } else {
            for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return a.charAt(i) < b.charAt(i) ? 1 : -1;
                }
            }
            return a.length() < b.length() ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (compare(s[i], s[j]) == 1) {
                    String x = s[j];
                    s[j] = s[i];
                    s[i] = x;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }

}
