package Working_wich_Numbers;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 5; // Замените на любое положительное число, чтобы получить соответствующее число Фибоначчи
        int result = fibonacci(n);
        int resultFor = fibonacciFor(n);
        System.out.println("Число Фибоначчи для n=" + n + ": " + result);
        System.out.println("Число Фибоначчи для n=" + n + ": " + resultFor);
    }

    //рекурсивный
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciFor(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }


}
