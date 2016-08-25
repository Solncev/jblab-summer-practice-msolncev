package Iterator;

/**
 * Created by Марат on 25.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        RangeCollection rc = new RangeCollection(3);
        for (int i = 0; i < 2; i++) {
            rc.add(i);
        }
        rc.iterator();
        System.out.println(rc.toString());
    }
}
