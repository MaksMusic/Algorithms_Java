package Search;

import java.util.HashMap;
import java.util.Map;

public class SearchUniqueNumber {
    public volatile  int f   = 10;

    public static void main(String[] args) {
        int []  box = {1,1,1,1,1,1,1,1,1,1,21,3,1,33,123,1};
        System.out.println(searchUnique(box));
    }

    public static int searchUnique(int [] array){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            //вернет 0 если нету в мапе или число array[i] если есть в мапе такой  key
            Integer x = map.getOrDefault(array[i],0);
            System.out.println(x);
            map.put(array[i],++x); //21:1  3:1 4:1 1: 2-1
        }
        //у всех уникальных чисел в качестве индекса value будет 1 и key само число
        System.out.println(map);

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i])==1){
                return array[i];
            }
        }






        return 1;

    }
}
