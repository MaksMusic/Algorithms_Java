package Search.typeSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int index = search(
                new int[] {2,4,5,6,3,4,3,2,110,3,2,123,23,23,4,42,42,4,24,23,42,34,10,423},10);
        System.out.println(index);
    }



    public static int search(int [] arr,int number){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if ( arr[i] == number ){
                System.out.println("count " + count);
                return i;
            }

        }
        System.out.println("count " + count);
        return -1;
    }
}
