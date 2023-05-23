import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MostRepeatedWord {

    public static void main(String args[]) {
        String input = "Lorem Ipsum is simply dummy test of the printing of the lorem";
        List<String> normalized = normalizeString(input);
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for(String word: normalized) {
            if(wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) +1);
            }
            else {
                wordCountMap.put(word, 1);
            }
        }

        int max = 0;
        String mostRepeatedWord = "";
        for(String key: wordCountMap.keySet()){
            if(wordCountMap.get(key) > max) {
                max = wordCountMap.get(key);
                mostRepeatedWord = key;
            }
        }
        System.out.println("Most Repeated Word: "+mostRepeatedWord + " was repeated "+ max + " times");
    }

    public static List<String> normalizeString(String input) {
        String lowercaseTrimed = input.trim().toLowerCase();
        String[] words = lowercaseTrimed.split("[ \\n\\t\\r.,;:?(){]");
        List commonWords = List.of("the", "a","is","of");
        return Arrays.stream(words)
                .filter(word -> !commonWords.contains(word) && word.length() != 0)
                .collect(Collectors.toList());
    }
}
