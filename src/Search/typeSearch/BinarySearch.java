package Search.typeSearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int index = binarySearch(
                new int[] {2,4,5,6,3,4,3,2,110,3,2,123,23,23,4,42,42,4,24,23,42,34,10,423},10);
        System.out.println(index);
    }



    public static int binarySearch(int [] arr,int number){
        Arrays.sort(arr);
        int count = 0;
        int startIndex = 0;
        int endIndex = arr.length-1;

        if (number < arr[0]) return -1;
        if (number > arr[arr.length-1]) return -1;

        while (startIndex <= endIndex){
            count++;
            int midlIndex = startIndex + (endIndex - startIndex) /2;

            if (arr[midlIndex] > number) endIndex = midlIndex - 1;
            else if (arr[midlIndex] < number) startIndex = midlIndex + 1;
            else {
                System.out.println("count " + count);
                return midlIndex;
            }

        }
        System.out.println("count " + count);
        return -1;
    }
}
