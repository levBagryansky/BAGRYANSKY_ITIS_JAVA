import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    static void sort(int[] array){
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int indexmax = j;
            for (int i = j; i < n; i++) {
                if (array[indexmax] > array[i])
                    indexmax = i;
            }
            int buf = array[indexmax];
            array[indexmax] = array[j];
            array[j] = buf;
        }
        System.out.print(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sort(arr);
    }
}