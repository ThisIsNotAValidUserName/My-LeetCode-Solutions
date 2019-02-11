import java.util.ArrayList;
import java.util.List;

public class Solution118 {

    /**
     * Iterative method
     * 1ms, 94.91%
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        //numRows = 0
        if (numRows == 0)
            return triangle;

        //numRows = 1
        List<Integer> rowOne = new ArrayList<>();
        rowOne.add(1);
        triangle.add(rowOne);

        //numRows >= 2
        for (int i = 2 ; i <= numRows ; i++) {
            List<Integer> previous = triangle.get(i - 2);
            List<Integer> current = new ArrayList<>();
            for (int j = 1 ; j <= i ; j++) {
                if (j == 1 || j == i)
                    current.add(1);
                else
                    current.add(previous.get(j - 2) + previous.get(j - 1));
            }
            triangle.add(current);
        }
        return triangle;
    }
}
