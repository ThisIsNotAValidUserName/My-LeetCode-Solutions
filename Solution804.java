import java.util.HashSet;
import java.util.Set;

/*
 Solution for LeetCode 804
 */
public class Solution804 {

    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0 || words == null)
            return 0;
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> stringSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < word.length() ; i++) {
                sb.append(morseCodes[word.charAt(i) - 97]);
            }
            stringSet.add(sb.toString());
        }
        return stringSet.size();
    }

}
