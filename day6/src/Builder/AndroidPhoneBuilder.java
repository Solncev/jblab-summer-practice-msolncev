package Builder;

/**
 * Created by Марат on 23.08.2016.
 */
public class AndroidPhoneBuilder extends PhoneBuilder {
    @Override
    public void buildPrice() {
        phone.setPrice(500);
    }

    @Override
    public void buildOS() {
        phone.setoS("Android");
    }
}
