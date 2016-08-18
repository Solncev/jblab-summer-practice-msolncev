import java.util.Scanner;

/**
 * Created by Марат on 17.08.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * (x * (x * (x * x - 4) + 2) - 5) + 10);
    }
}
