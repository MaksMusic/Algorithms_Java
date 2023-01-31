package Search.typeSearch;

import java.util.Arrays;

public class JumpSearch {
    public static void main(String[] args) {
        int index = jumpSearch(
        new int[] {2,4,5,6,3,4,3,2,110,3,2,123,23,23,4,42,42,4,24,23,42,34,10,423},10);
        System.out.println(index);

    }


    public static int jumpSearch(int[] arr, int number) {
        int count = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arrlinght = arr.length;
        int jump = (int) Math.sqrt(arr.length);
        int previousStep = 0;

        while (arr[Math.min(arrlinght, jump) - 1] < number) {
            count++;
            previousStep = jump;
            jump += (int) Math.sqrt(arrlinght);
            if (previousStep >= arrlinght) {
                System.out.println("count " + count);
                return -1;
            }
        }

        while (arr[previousStep] < number){
            previousStep++;
            if (previousStep ==  Math.min(jump,arrlinght)){
                return  -1;
            }

        }

        if (arr[previousStep] == number) {
            System.out.println("count " + count);
            return previousStep;
        }

        System.out.println("count " + count);
        return -1;
    }
}