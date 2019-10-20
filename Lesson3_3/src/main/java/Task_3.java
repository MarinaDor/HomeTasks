import java.util.Arrays;

public class Task_3 {
    //3. Fill the array with numbers from 100 to 0.
    public static void main(String[] args) {
        int [] array1 = new int [101];
        int i = 0;
        for(int j = array1.length -1; j >= 0; j--){
            array1[j]=i;
            i++;
        }
        System.out.println(Arrays.toString(array1));
    }
}
