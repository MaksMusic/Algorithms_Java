package YandexAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Ñhange {
    public static void main(String[] args) {
        System.out.println(returnChange(177,5,new ArrayList<>(List.of(100,50,10,5,1))));
    }

    public static List<Integer> returnChange(int sum, int price, List<Integer> denomination) {
        List<Integer> change = new ArrayList();
        int totalChange = sum-price;
        for (Integer i : denomination) {
            if (totalChange <= 0) break;

            while (totalChange > 0) {
                if (i <= totalChange) {
                    totalChange -= i;
                    change.add(i);
                }else {
                    break;
                }
            }
        }
        return change;
    }
}
