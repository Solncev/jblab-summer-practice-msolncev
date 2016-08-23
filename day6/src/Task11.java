import java.util.Random;
import java.util.Scanner;

/**
 * Created by Марат on 23.08.2016.
 */
public class Task11 {
    public static void main(String[] args) {
        Random random = new Random(0);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(random.nextInt(10) - 3);
        }
    }
}
