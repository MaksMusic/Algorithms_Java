package ArrayMerging;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMergingJava8 {
    public static void main(String[] args) {
        int [] ass1 = {1,2,3,4,5,6,7,8,9,10};
        int [] ass2 = {21,20,19,18,17,16,15,14,13,12,11,10};
        System.out.println(Arrays.toString(mergingArraySort(ass1,ass2)));
    }
    // Метод объединения двух массивов в Java 8 и выше
    public static int[] mergingArray (int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .toArray();
    }

    // Метод объединения двух массивов и сортировка в Java 8 и выше
    public static int[] mergingArraySort (int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b).sorted())
                .toArray();
    }
}



