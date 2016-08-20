/**
 * Created by Марат on 20.08.2016.
 */
public class God {
    private static God god;
    private static String name = "Ra";

    private God(){

    }

    public static God getGod(){
        if (god == null)
            god = new God();
        return god;
    }

    public void toPunish(String person){
        System.out.println(person + " , you are punished!");
    }

    public void toGreet(){
        System.out.println("Hello, God " + name +"! ");
    }
}
