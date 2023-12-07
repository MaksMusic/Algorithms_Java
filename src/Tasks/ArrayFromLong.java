package Tasks;

import java.util.Arrays;

/**
 * Задача с собеса 5
 * Получить массив чисел  из числа Long где каждое число в отдельной ячейке
 * Пример передаем  метод число 11197
 * вывод массив Integer
 * (1,1,1,9,7)
 */
public class ArrayFromLong {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(toArray(1995)));
    }


    public static int[] toArray(long n) {
        int[] array = new int[Long.toString(n).length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(Long.toString(n).charAt(i)));
        }
        return array;
    }
}


