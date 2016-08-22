import java.util.Scanner;

/**
 * Created by Марат on 22.08.2016.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.length() == b.length()) {
            boolean flag = true;
            for (int i = 0; i < a.length() && flag; i++) {
                flag = (a.charAt(i) == b.charAt(i));
            }
            System.out.println(flag);
        } else {
            System.out.println("false");
        }
    }
}
