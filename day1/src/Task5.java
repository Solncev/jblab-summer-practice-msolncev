/**
 * Created by Марат on 17.08.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        boolean flag = false;
        int [] a = new int[]{12, 0, 4, -567, 321, 0};
        int j = -1;
        for (int i = 0; i < a.length && !flag; i++){
            j = i;
            flag = a[i] == 0;
        }
        if (j == -1){
            System.out.println("does not 0 in this array");
        }
        else{
            System.out.println("in " + j + " position");
        }
    }
}
