public class ContainsVowels {

    public static void main(String[] args) {
        String str = "jelly";
        System.out.println(containsVowels(str));
    }

    public static boolean containsVowels(String str) {
        if(str.toLowerCase().trim().matches(".*[aeiouy].*")) {
            return true;
        }
        return false;
    }
}
