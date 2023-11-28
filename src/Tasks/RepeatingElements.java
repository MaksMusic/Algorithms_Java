package Tasks;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Метод для возвращения всех повторяющихся элементов массива:
 */
public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = {9, 7,9, 9, -1, 6, 7, -1, 4, 5};
        List<Integer> listArr = findDuplicates(arr);
        System.out.println(listArr);

        List<Integer> list  = Arrays.asList(9, 7,9, 9, -1, 6, 7, -1, 4, 5);
        List<Integer> repeating = repeating(list);
        System.out.println(repeating);

    }


    //лист
    public static List<Integer> repeating(List<Integer> list){
        return list.stream()
                .filter(i -> list.indexOf(i) != list.lastIndexOf(i))
                .distinct()
                .collect(Collectors.toList());
    }

    //массив
    public static List<Integer> findDuplicates(int[] arr) {
        // Хранение элементов и их частоты в HashMap
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Список для хранения повторяющихся элементов
        List<Integer> duplicates = new ArrayList<>();

        // Первый проход по массиву для подсчета частоты встречаемости каждого элемента
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // Увеличиваем частоту элемента на 1, если он уже встречался,
            // иначе добавляем с частотой 1
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Второй проход по массиву для поиска повторяющихся элементов
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // Если элемент встречается более одного раза, добавляем его в список повторяющихся
            if (elementCount.get(num) > 1) {
                duplicates.add(num);
                // Устанавливаем частоту элемента в 0, чтобы избежать добавления его несколько раз
                elementCount.put(num, 0);
            }
        }

        // Возвращаем список повторяющихся элементов
        return duplicates;
    }


}
