/**
 * Created by Марат on 20.08.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            a[i] = new Integer(args[i]);
            if (i % 3 == 0) {
                s += a[i];
            }
        }
        System.out.println(s);
    }
}
