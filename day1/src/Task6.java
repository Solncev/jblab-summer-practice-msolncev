/**
 * Created by Марат on 17.08.2016.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[]{12, 0, 4, -567, 321, 0};
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min = " + min);
    }
}
