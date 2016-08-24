package Builder;

/**
 * Created by Марат on 23.08.2016.
 */
public class IPhoneBuilder extends PhoneBuilder {

    public void buildPrice() {
        phone.setPrice(750);
    }

    @Override
    public void buildOS() {
        phone.setoS("iOS");
    }
}
