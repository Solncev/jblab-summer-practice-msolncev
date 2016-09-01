/**
 * Created by Марат on 01.09.2016.
 */
public class MyPhone implements Phone {
    private int price;
    private String oS;

    public int getPrice() {
        return price;
    }

    public String getoS() {
        return oS;
    }

    public void call() {
        System.out.println("Hello!");
    }

    public static PhoneBuilder createPhone() {
        return new MyPhone().new PhoneBuilder();
    }

    class PhoneBuilder extends MyPhone {
        private PhoneBuilder() {
        }

        public PhoneBuilder setPrice(int price) {
            MyPhone.this.price = price;
            return this;
        }

        public PhoneBuilder setOS(String os){
            MyPhone.this.oS = os;
            return this;
        }

        public MyPhone build(){
            return MyPhone.this;
        }
    }


}
