package Tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Необходимо реализовать метод, который вернет первое значение представленные в единственном виде.
 */

public class FirstElement {
    public static void main(String[] args) {

        Integer[] arr = {1, 10, 5, 6, 7, 7, 5, 9, 7};

        Integer result = find(arr);

        if (result != null) {
            System.out.println(" 1 не повторяющийся элемент " + result);
        } else {
            System.out.println("не найдено");
        }


    }

    public static Integer find(Integer[] arr) {
        Map<Integer,Integer> elements = new HashMap<>();

        // Проходим по массиву и обновляем сколько раз элемент встречается в HashMap
        for( Integer el : arr) {
            elements.put(el, elements.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : elements.entrySet() ) {
            // Если частота элемента равна 1, то это первый неповторяющийся элемент
            if( entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }


}



