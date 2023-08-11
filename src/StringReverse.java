public class StringReverse {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Reverse of " + s + " is " +reverseString(s));
        String s1 = "Hello I am here";
        System.out.println("Reverse of " + s1 + " is " +reverseWordsInAString(s1));
    }

    public static String reverseString(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        //StringBuilder without using reverse function
        /*StringBuilder reverseString = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
            reverseString.append(s.charAt(i));
        }
        return reverseString.toString();*/
        //StringBuilder using reverse function
        StringBuilder reverseString = new StringBuilder(s);
        return reverseString.reverse().toString();

        // synchronized, performance overhead
        //StringBuffer without using reverse function
        /*StringBuffer reverseString = new StringBuffer();
        for(int i=s.length()-1; i>=0; i--) {
            reverseString.append(s.charAt(i));
        }
        return reverseString.toString();*/
        // StringBuffer with reverse function
        /*StringBuffer reverseString = new StringBuffer(s);
        return reverseString.reverse().toString();*/
    }

    public static String reverseWordsInAString(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder reversedString = new StringBuilder();
        String[] words = s.split(" ");
        for(String word: words) {
            reversedString.append(reverseString(word)).append(" ");
        }
        return reversedString.toString();
    }
}
