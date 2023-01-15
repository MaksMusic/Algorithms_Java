package Time_check;

import java.util.Arrays;
import java.util.Random;

public class Time {
    public static void main(String[] args) {
        int [] arr = new int[1_000_000];
        fillArray(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        long time = System.nanoTime(); //старт


        int index = search(arr,1200000);

        System.out.println(index);
        System.out.println( (double) (System.nanoTime() - time) / 1_000_000_000);//финиш

    }


    public static int search(int [] array,int n){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                return i;
            }
        }
        return -1;
    }


    public static void fillArray(int [] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  random.nextInt(1_000_000)+1;
        }
    }
}
