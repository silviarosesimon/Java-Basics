import java.util.List;
import java.util.stream.Collectors;

public class CharacterCount {

    public static void main(String[] args) {
        String input = args[0];
        String normalized = input.trim().toLowerCase();
        String vowels = "aeiouy";

        // Traditional way
        char[] normalizedArray = normalized.toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;
        for(char c: normalizedArray) {
            if(vowels.indexOf(c) != -1) {
                vowelCount++;
            }
            else if(c!=' ') {
                consonantCount++;
            }
        }

        System.out.println("There are " + vowelCount + " vowels in " + input);
        System.out.println("There are " + consonantCount + " consonants in " + input);

        //Java 8 way
        List<Integer> letters = normalized.chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowelsCount = letters.stream()
                .filter(c -> vowels.indexOf(c) != -1)
                .count();

        long consonantsCount = letters.stream().count() - vowelCount;

        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + consonantsCount + " consonants in " + input);
    }
}
