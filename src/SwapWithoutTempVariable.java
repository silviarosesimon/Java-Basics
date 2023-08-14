public class SwapWithoutTempVariable {

    public static void main(String[] args) {
        //swap(5,6);
        swap2(5,6);
    }

    public static void swap(int a, int b) {
        System.out.println("Numbers before swap are " + a + " and " + b);
        a = b-a;
        b = b-a;
        a = a+b;
        System.out.println("Numbers after swap are " + a + " and " + b);
    }

    public static void swap2(int a, int b) {
        System.out.println("Numbers before swap are " + a + " and " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Numbers after swap are " + a + " and " + b);
    }
}
