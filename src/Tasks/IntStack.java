package Tasks;

class Main{
    public static void main(String[] args) {
        IntStack intStack = new IntStack(100);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}


public class IntStack {
    private int[] elements; // ������ ��� �������� ��������� �����
    private int size; // ������� ������ ����� (���������� ���������)

    // �����������, ���������������� ������ � ������ �����
    public IntStack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }
    // ����� ��� ���������� �������� � ����
    public void push(int item) {
        if (size == elements.length) {
            throw new IllegalStateException("Stack is full"); // ����������, ���� ���� �����
        }
        elements[size] = item; // ���������� �������� � ����
        size++; // ���������� ������� �����
    }

    // ����� ��� ���������� �������� �� �����
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // ����������, ���� ���� ����
        }
        size--; // ���������� ������� �����
        return elements[size]; // ����������� ������������ ��������
    }

    // �������������� ����� ��� ��������, ���� �� ����
    private boolean isEmpty() {
        return size == 0;
    }
}
