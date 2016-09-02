import java.lang.reflect.Field;

/**
 * Created by Марат on 01.09.2016.
 */
public class Human {
    private String name;

    public Human() {
        name = "Muhammad";
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Human human = new Human();
        Field field = Human.class.getDeclaredField("name");
        field.setAccessible(true);
        String a = (String) field.get(human);
        System.out.println(a);
    }
}
