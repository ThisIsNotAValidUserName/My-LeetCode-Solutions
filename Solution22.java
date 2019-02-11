import java.util.ArrayList;
import java.util.List;

public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        if (n == 0) {
            answer.add("");
            return answer;
        }
        int leftNum = 0, rightNum = 0;
        String str = new String();

        generate(leftNum, rightNum, n, str, answer);

        return answer;
    }

    private void generate(int leftNum, int rightNum, int n, String str, List<String> list) {

        if (leftNum > n || rightNum > n || rightNum > leftNum)
            return;

        if (leftNum == n && rightNum == n) {
            list.add(str);
            return;
        }

        generate(leftNum + 1, rightNum, n, str + "(", list);
        generate(leftNum, rightNum + 1, n, str + ")", list);
    }

}
