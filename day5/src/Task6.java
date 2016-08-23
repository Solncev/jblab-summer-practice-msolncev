/**
 * Created by Марат on 22.08.2016.
 */
public class Task6 {
    public static void main(String[] args) {
        final double e = 0.000001;
        double s = 0.0;
        double k = 1;
        double i = 1;
        while (1 / (i * i) > e) {
            s = s + k / (i * i);
            i = i + 2;
            k *= -1;
        }
        System.out.println(s);
    }
}
