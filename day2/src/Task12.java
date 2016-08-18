/**
 * Created by Марат on 17.08.2016.
 */
public class Task12 {
    public static void main(String[] args) {
        String s = args[0];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                k++;
            }
        }
        System.out.println(k);
    }
}
