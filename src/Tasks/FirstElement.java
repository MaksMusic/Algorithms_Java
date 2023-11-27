package Tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * ���������� ����������� �����, ������� ������ ������ �������� �������������� � ������������ ����.
 */

public class FirstElement {
    public static void main(String[] args) {

        Integer[] arr = {1, 10, 5, 6, 7, 7, 5, 9, 7};

        Integer result = find(arr);

        if (result != null) {
            System.out.println(" 1 �� ������������� ������� " + result);
        } else {
            System.out.println("�� �������");
        }


    }

    public static Integer find(Integer[] arr) {
        Map<Integer,Integer> elements = new HashMap<>();

        // �������� �� ������� � ��������� ������� ��� ������� ����������� � HashMap
        for( Integer el : arr) {
            elements.put(el, elements.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : elements.entrySet() ) {
            // ���� ������� �������� ����� 1, �� ��� ������ ��������������� �������
            if( entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }


}



