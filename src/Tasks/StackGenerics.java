package Tasks;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Ќаписать обобщенный класс стека, который может хранить элементы любого типа
 */
public class StackGenerics {
    public static void main(String[] args) {

    }
}


class Stack<T> {
    private ArrayList<T> items = new ArrayList<T>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (items.size() == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    public T peek() {
        if (items.size() == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
