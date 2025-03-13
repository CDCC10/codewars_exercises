import java.util.HashMap;
import java.util.Map;

public class Isogram {
    /**
     * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function
     * that determines whether a string that contains only letters is an isogram. Assume the empty string is an
     * isogram. Ignore letter case.
     * @param word - The word that will be verified
     * @return - if it meets the conditions
     */
    public static boolean isIsogram(String word) {
        Map<Character, Integer> results = new HashMap<>();
        if (word.isEmpty()) {
            return true;
        }
        if (word.length() == 1) {
            return false;
        }
        String[] characters = word.toLowerCase().split("");
        for (String character : characters) {
            if (results.containsKey(character.charAt(0))) {
                return false;
            }
            results.put(character.charAt(0),0);
        }
        return true;
    }
}
