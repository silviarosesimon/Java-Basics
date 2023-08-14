public class Fibonacci {

    public static void main(String[] args) {
        int count = 10;
        printFibonacciUsingRecursion(count);
        printFibonacci(count);
    }

    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) +fibonacci(n - 2);
    }
    public static void printFibonacciUsingRecursion(int count) {
        for(int i=0; i<count; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static void printFibonacci(int count) {
        int a = 0;
        int b =1 , c = 1;
        for(int i=1; i<=count; i++) {
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
