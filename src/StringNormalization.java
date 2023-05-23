public class StringNormalization {

    public static void main(String[] args) {
        String s = "   Hello there , BUDDY";
        System.out.println(s + " is normalized to " +
                normalizeString(s));
    }

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",","");
    }
}
