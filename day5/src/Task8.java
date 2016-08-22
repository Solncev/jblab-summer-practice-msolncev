/**
 * Created by Марат on 22.08.2016.
 */
public class Task8 {
    public static void main(String[] args) {
        String s = args[0];
        String a = args[1];
        if (s.length() >= a.length()) {
            boolean flag = false;
            for (int i = 0; i < s.length() - a.length() && !flag; i++) {
                String b = s.substring(i, i + a.length());
                flag = (a.equals(b));
            }
            System.out.println(flag);
        } else {
            System.out.println("false");
        }
    }
}
