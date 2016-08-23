package Builder;

/**
 * Created by Марат on 23.08.2016.
 */
public class Manufacturer {
    private PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder pb) {
        phoneBuilder = pb;
    }

    public Phone getPhone() {
        return phoneBuilder.getPhone();
    }

    public void constructPhone() {
        phoneBuilder.createNewPhone();
        phoneBuilder.buildOS();
        phoneBuilder.buildPrice();
    }
}
