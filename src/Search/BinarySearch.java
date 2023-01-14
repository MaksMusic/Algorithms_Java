package Search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int index = binarySearch(
                new int[] {2,4,5,6,3,4,3,2,10,3,2,123,23,23,4,42,42,4,24,23,42,34,234,2,423},10);
    }



    public static int binarySearch(int [] arr,int number){
        Arrays.sort(arr);
        int jump =  (int) Math.sqrt(arr.length-1);
        int startIndex = 0;
        int endIndex = arr.length-1;
        int midlIndex = startIndex + (endIndex - startIndex) / 2;

        if (number < arr[0]) return -1;
        if (number > arr[arr.length-1]) return -1;

        if (number < midlIndex){

        }
        return -1;
    }
}
