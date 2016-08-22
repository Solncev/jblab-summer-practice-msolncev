/**
 * Created by Марат on 20.08.2016.
 */
public class President {
    private static volatile President president;
    private static String name = "Putin";

    private President() {

    }

    public static President getPresident() {
        if (president == null)
            synchronized (President.class) {
                if (president == null)
                    president = new President();
            }
        return president;
    }

    public void change(String newName) {
        name = newName;
    }

    public void toGreet() {
        System.out.println("Hello, Mr." + name + "! ");
    }
}
