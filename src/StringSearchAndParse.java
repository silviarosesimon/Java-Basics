public class StringSearchAndParse {

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));
        System.out.println("Contents: ");
        parseContents(s);
        System.out.println(isAtEvenIndex(s.toLowerCase(), 'l'));
    }

    public static void parseContents(String s) {
        for (char c: s.toCharArray()) {
            System.out.println(c);
        }
        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static boolean isAtEvenIndex(String s, char c) {
        if(s == null || s.isEmpty()) {
            return false;
        }
        for(int i=0; i<s.length(); i=i+2) {
            if(s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
