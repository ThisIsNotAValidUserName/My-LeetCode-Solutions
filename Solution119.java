import java.util.ArrayList;
import java.util.List;

public class Solution119 {

    /**
     * Use the formula, pay attention to overflow problems (long) and when rowIndex = 0 / rowIndex = 1
     * 1ms, 97.28%
     */

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if (rowIndex == 0)
            return ans;
        else if (rowIndex == 1) {
            ans.add(1);
            return ans;
        }
        else {
            long num = 1;
            int lower = 1;
            for (int i = 1 ; i < rowIndex ; i++) {
                num *= rowIndex - i + 1;
                num /= lower++;
                ans.add((int)num);
            }
        }
        ans.add(1);
        return ans;
    }
}
