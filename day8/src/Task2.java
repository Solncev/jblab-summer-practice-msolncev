import java.util.Scanner;

/**
 * Created by Марат on 26.08.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = 1;
        int number = 0;
        if (s.charAt(0) == '-') {
            k = -1;
            for (int i = 1; i < s.length(); i++) {
                number = number * 10 + Character.getNumericValue(s.charAt(i));
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                number = number * 10 + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(number * k);
    }
}
