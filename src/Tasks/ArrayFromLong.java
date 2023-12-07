package Tasks;

import java.util.Arrays;

/**
 * Получить массив строк  из числа Long где каждое число в отдельной ячейке
 * Пример передаем  метод строку 11197
 * вывод массив
 * (1,1,1,9,7)
 */
public class ArrayFromLong {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(toArray(1995)));
    }


    public static int[] toArray(long n){
        int [] array = new int[Long.toString(n).length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(Long.toString(n).charAt(i)));
        }
        return array;
    }
}


