import java.nio.file.FileSystemNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    /*
     Solution237 for LeetCode 3
     */

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int maxWindowSize = 0, headIndex = 0;
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            //System.out.println("Index: " + i);
            //System.out.println("headIndex: " + headIndex);
            char currentChar = s.charAt(i);
            if (characterSet.contains(currentChar)) {
                maxWindowSize = Math.max(maxWindowSize, characterSet.size());
                //Current subString we are looking at
                String subString = s.substring(headIndex, headIndex + characterSet.size());
                //System.out.println("Substring: " + subString);
                //First character after the repeated character
                int indexTemp = subString.lastIndexOf(currentChar) + headIndex + 1;
                int tailIndex = indexTemp < s.length() ? indexTemp : s.length() - 1;
                //System.out.println("tailIndex: " + tailIndex);
                //Remove elements of the subString before the repeated character and the repeated character itself from the set
                //System.out.print("Set before remove: " + characterSet + "   ");
                for (int j = headIndex ; j < tailIndex ; j++) {
                    characterSet.remove(s.charAt(j));
                }
                headIndex = tailIndex;
            }
            characterSet.add(currentChar);
            //System.out.println("Set after:" + characterSet);
        }
        maxWindowSize = Math.max(maxWindowSize, characterSet.size());
        return maxWindowSize;
    }
}
