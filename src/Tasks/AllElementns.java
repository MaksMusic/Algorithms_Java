package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mетод, который вернет все элементы, представленные в единственном виде:
 */
class AllElements {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, -1, 6, 7, -1, 4, 5};

        // Вызываем метод findUniqueElements для поиска единственных элементов
        List<Integer> uniqueElements = findUniqueElements(arr);
        System.out.println("Единственные элементы: " + uniqueElements);
    }

    public static List<Integer> findUniqueElements(int[] arr) {
        // Хранение элементов и их частоты в HashMap
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Список для хранения единственных элементов
        List<Integer> uniqueElements = new ArrayList<>();

        // Первый проход по массиву для подсчета частоты встречаемости каждого элемента
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // Увеличиваем частоту элемента на 1, если он уже встречался, иначе добавляем с частотой 1
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Второй проход по массиву для поиска единственных элементов
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // Если элемент встречается ровно один раз, добавляем его в список единственных
            if (elementCount.get(num) == 1) {
                uniqueElements.add(num);
            }
        }

        // Возвращаем список единственных элементов
        return uniqueElements;
    }


}
