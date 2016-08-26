/**
 * Created by Марат on 26.08.2016.
 */
public class Task3 {
    public static int compare(String a, String b) {
        if (a.equals(b)) {
            return 0;
        } else {
            for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return a.charAt(i) < b.charAt(i) ? 1 : -1;
                }
            }
            return a.length() < b.length() ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(compare("bar", "abe"));
    }
}
