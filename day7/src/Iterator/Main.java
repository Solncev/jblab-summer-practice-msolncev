package Iterator;

/**
 * Created by Марат on 25.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        RangeCollection rc = new RangeCollection(3,10);
        rc.iterator();
        System.out.println(rc.toString());
    }
}
