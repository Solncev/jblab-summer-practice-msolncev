/**
 * Created by Марат on 26.08.2016.
 */
public class Task4 extends Task3 {
    public static void main(String[] args) {
        String min = args[0];
        String max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (compare(min, args[i]) == -1) {
                min = args[i];
            }
            if (compare(max, args[i]) == 1) {
                max = args[i];
            }
        }
        System.out.println("min = " + min + " , max = " + max);
    }
}
