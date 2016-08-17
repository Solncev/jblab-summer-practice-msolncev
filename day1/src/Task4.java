/**
 * Created by Марат on 17.08.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[]{12, 4, -567, 321, 0};
        int s = 0;
        int p = 1;
        for (int x : a) {
            if (x > 0) {
                p *= x;
            }
            if (x % 2 == 0) {
                s += x;
            }
        }
        System.out.println("S = " + s);
        System.out.println("P = " + p);
    }
}
