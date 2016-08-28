/**
 * Created by Марат on 26.08.2016.
 */
public class Task1 {
    public static int gcd(int a, int b) {
        int c;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        c = max % min;
        if (c == 0) {
            return min;
        } else {
            return gcd(min, c);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(5, 14));
    }
}
