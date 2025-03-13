public class Vowel {
    /**
     * Return the number (count) of vowels in the given string.
     * We will consider a, e, i, o, u as vowels for this Kata (but not y).
     * The input string will only consist of lower case letters and/or spaces.
     * @param str - word to verify
     * @return - quantity of vowels
     */
    public static int getCount(String str) {
        return (int)str.chars().filter(character -> "aeiou".indexOf(character) != -1).count();
    }
}
