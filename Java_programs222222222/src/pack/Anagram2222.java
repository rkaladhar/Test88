package pack;

import java.util.stream.Collectors;
import java.util.function.Function;

public class Anagram2222 {
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to frequency maps and compare them
        return str1.chars()
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                   .equals(
                       str2.chars()
                           .mapToObj(c -> (char) c)
                           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                   );
    }

    public static void main(String[] args) {
        String str1 = "pen";
        String str2 = "nepf";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }
    }
}