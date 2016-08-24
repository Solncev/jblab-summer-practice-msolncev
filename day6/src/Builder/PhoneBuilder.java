package Builder;

/**
 * Created by Марат on 23.08.2016.
 */
public abstract class PhoneBuilder {
    protected Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void createNewPhone() {
        phone = new Phone();
    }

    public abstract void buildPrice();

    public abstract void buildOS();
}
