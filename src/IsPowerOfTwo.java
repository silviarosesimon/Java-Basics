public class IsPowerOfTwo {

    public static void main(String[] args) {
        int n= 8;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        while(n != 1) {
            if(n % 2 != 0) {
                return false;
            }
            n = n/2;
        }
        if(n == 1) {
            return true;
        }
        return false;
    }
}
