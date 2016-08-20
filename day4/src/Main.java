/**
 * Created by Марат on 20.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        President president = President.getPresident();
        president.change("Medvedev");
        president.toGreet();

        God god = God.getGod();
        god.toPunish("Nick");
        god.toGreet();
    }
}
