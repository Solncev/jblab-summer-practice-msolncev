import java.util.Scanner;

/**
 * Created by Марат on 18.08.2016.
 */
public class Task17 {
    public static void main(String[] args) {
        String s = "";
        String b = "";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b += "1";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s + b);
            s += " ";
        }
    }
}
