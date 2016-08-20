/**
 * Created by Марат on 19.08.2016.
 */
public class Task19 {
    public static void main(String[] args) {
        int s = 0;
        for (String r : args) {
            int x = new Integer(r);
            if (x % 3 == 0) {
                s += x;
            }
        }
        System.out.println(s);
    }
}
