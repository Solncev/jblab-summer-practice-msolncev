import java.util.Scanner;

/**
 * Created by Марат on 17.08.2016.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        y = x > -4 ? (x - 1) / (x + 3) : 2 * x - 5;
        System.out.println(y);
    }
}
