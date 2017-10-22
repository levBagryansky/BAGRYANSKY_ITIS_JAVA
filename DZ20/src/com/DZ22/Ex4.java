import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    static void change(int[] array){
        int n = array.length;
        for(int i = 1; i < n; i++){
            if (array[i] == 0)
                array[i] = -1 * array[i - 1];

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 0, 5, 6, 7,0, 1, 0, 10};
        change(arr);
    }
}