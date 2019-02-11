import java.util.ArrayList;
import java.util.List;

public class Solution17 {

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return answer;

        String[] maps = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
        "tuv", "wxyz"};

        String[] input = new String[digits.length()];

        for (int i = 0 ; i < digits.length() ; i++) {
            int currentNum = digits.charAt(i) - '0';
            input[i] = maps[currentNum];
        }

        StringBuffer sb = new StringBuffer();
        recursion(input, answer, sb, 0);

        return answer;

    }

    //3ms
    private boolean recursion(String[] input, List<String> list, StringBuffer sb, int index) {

        System.out.println("index: " + index);

        if (index == input.length) {
            list.add(sb.toString());
            return true;
        }

        String temp = input[index];

        for (int i = 0 ; i < temp.length() ; i++) {
            sb.append(temp.charAt(i));
            index++;
            boolean end = recursion(input, list, sb, index);
            if (end) {
                index--;
                sb = new StringBuffer(sb.toString().substring(0, index));
                continue;
            }
        }
        return true;
    }

    /* 4ms
    private static boolean recursion(String digits, String[] maps, List<String> list, StringBuffer sb, int index) {

        System.out.println("index: " + index);

        if (index == digits.length()) {
            list.add(sb.toString());
            return true;
        }

        int currentNum = digits.charAt(index) - '0';
        String temp = maps[currentNum];

        for (int i = 0 ; i < temp.length() ; i++) {
            sb.append(temp.charAt(i));
            index++;
            boolean end = recursion(digits, maps, list, sb, index);
            if (end) {
                index--;
                sb = new StringBuffer(sb.toString().substring(0, index));
                continue;
            }
        }
        return true;
    }
    */

}
