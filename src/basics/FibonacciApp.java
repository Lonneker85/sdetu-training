package basics;

public class FibonacciApp {
    public static void main(String[] args) {
        // Fibonacci number is defined by the sum of the 2 previous Fibonacci numbers
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = fib(1) + fib(0) = 0 + 1 = 1
        // fib(3) = fib(2) + fib(1) = 1 + 1 = 2
        // fib(4) = fib(3) + fib(2) = 2 + 1 = 3
        //System.out.println(fib(0));

        int[] fibs = new int[8];
        fibs[0] = 0;
        fibs[1] = 1;
        fibs[2] = 2;
        fibs[3] = 3;
        fibs[4] = 4;
        fibs[5] = 5;
        fibs[6] = 6;
        fibs[7] = 7;
        //int fib = 0;
        for (int fib = 0; fib < 8; fib++)
            System.out.println(fibs[fib]);
    }


    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }
}
