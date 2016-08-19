import java.util.Scanner;

/**
 * Created by Марат on 18.08.2016.
 */
public class Task15 {
    public static void main(String[] args) {
        int s = 0;
        int p = 1;
        int[] a = new int[]{1, 2, 3, 547, 56, 68};
        for (int x : a) {
            s += x;
            p *= x;
        }
        System.out.println(s);
        System.out.println(p);
    }
}
