package algorithms.fibonacci;

public class FibonacciSequence {

    public int[] calculatingFibonacciNumbers(int quantity) {
        int[] fib = new int[quantity];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < quantity; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
