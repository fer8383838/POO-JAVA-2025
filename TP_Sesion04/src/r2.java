import java.util.Arrays;

public class r2 {
    public static void main(String[] args) {

        /*String [] array = {"Jose", "Carlos", "Miguel"};

        System.out.println(Arrays.toString(array));*/

        /*for (String al:array) {
            System.out.println(al);
        }*/
        String [] array = new String[5];
        array[2] = "Jose";
        array[3] = "Juan";
        array[4] = "Julio";
        for (int i= 0; i < array.length; i++ ){
            if(array[i] == null) {

            }else{
                System.out.println(array[i]);
            }
        }
    }
}
