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
    private int[] elements; // Массив для хранения элементов стека
    private int size; // Текущий размер стека (количество элементов)

    // Конструктор, инициализирующий массив и размер стека
    public IntStack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }
    // Метод для добавления элемента в стек
    public void push(int item) {
        if (size == elements.length) {
            throw new IllegalStateException("Stack is full"); // Исключение, если стек полон
        }
        elements[size] = item; // Добавление элемента в стек
        size++; // Увеличение размера стека
    }

    // Метод для извлечения элемента из стека
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Исключение, если стек пуст
        }
        size--; // Уменьшение размера стека
        return elements[size]; // Возвращение извлеченного элемента
    }

    // Дополнительный метод для проверки, пуст ли стек
    private boolean isEmpty() {
        return size == 0;
    }
}
