import java.util.ArrayList;
import java.util.List;

public class Solution859 {

    /*
     Solution237 for LeetCode 859
     */

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length() || A.length() == 0 || B.length() == 0)
            return false;
        /**** A和B相同时，A中有重复字符就返回True ****/
        if (A.equals(B)) {
            if (checkRepeatedLetters(A))
                return true;
            else
                return false;
        }

        /**** A和B不相同时 ****/
        List<Integer> list = new ArrayList<>();   //Store the indexes
        for (int i = 0 ; i < A.length() ; i++) {
            if (A.charAt(i) != B.charAt(i))
                list.add(i);
        }

        if (list.size() != 2)
            return false;
        else {
            if ((A.charAt(list.get(0)) == B.charAt(list.get(1))) &&
                    (A.charAt(list.get(1)) == B.charAt(list.get(0))))
                return true;
            else
                return false;
        }
    }

    private boolean checkRepeatedLetters(String str) {
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1 ; j < str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j))
                    return true;
            }
        }
        return false;
    }

}
