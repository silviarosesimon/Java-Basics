import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggestDigitInANumber {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Biggest digit in the number : " + number +
                " is: " + biggestDigitInANumber(number));
    }

    public static Character biggestDigitInANumber(int number) {
        String numString = String.valueOf(number);
        char[] digits = numString.toCharArray();
        List<Character> digitArray = new ArrayList();
        for (char digit: digits) {
            digitArray.add(digit);
        }
        Collections.sort(digitArray);
        return digitArray.get(digitArray.size()-1);
    }
}