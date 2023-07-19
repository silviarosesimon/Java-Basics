import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggestDigitInANumber {

    public static void main(String[] args) {
        System.out.println("Biggest digit in the number : " + args[0] +
                " is: " + biggestDigitInANumber(args[0]));
    }

    public static Character biggestDigitInANumber(String number) {
        char[] digits = number.toCharArray();
        List<Character> digitArray = new ArrayList();
        for (char digit: digits) {
            digitArray.add(digit);
        }
        Collections.sort(digitArray);
        return digitArray.get(digitArray.size()-1);
    }
}