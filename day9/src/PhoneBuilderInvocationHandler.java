import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Марат on 01.09.2016.
 */
public class PhoneBuilderInvocationHandler implements InvocationHandler {
    private Phone wrapped;

    public PhoneBuilderInvocationHandler(Phone phone) {
        wrapped = phone;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        Object dataOutput = method.invoke(wrapped, args);
        time = System.currentTimeMillis() - time;
        System.out.println(method.getName() + " spend " + time + " ms");
        return dataOutput;
    }


    public static void main(String[] args) {
        MyPhone myPhone = MyPhone.createPhone().setOS("Android").setPrice(1000).build();
        myPhone.call();
        Phone phone = myPhone.createPhoneBuilder(myPhone);
        phone.call();
    }
}
