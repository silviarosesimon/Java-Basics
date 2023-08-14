public class RemoveWhiteSpacesFromString {

    public static void main(String[] args) {
        String str = " qw we ";
        System.out.println(removeWhiteSpaces(str));
    }

    public static String removeLeadingTrailingWhiteSpace(String str) {
        //Character.isWhiteSpace, Unicode code points
        return str.strip();
        //identifies any character with a codepoint value less than or equal to U+0020
        // as a whitespace character.
        //return str.trim();
    }

    public static String removeWhiteSpaces(String str) {
        StringBuilder output = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(!Character.isWhitespace(c)) {
                output.append(c);
            }
        }
        return output.toString();
    }
}
