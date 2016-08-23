package Builder;

/**
 * Created by Марат on 23.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer();
        PhoneBuilder phoneBuilder = new IPhoneBuilder();
        manufacturer.setPhoneBuilder(phoneBuilder);
        manufacturer.constructPhone();
        Phone phone = manufacturer.getPhone();
    }
}
