/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 10:39
 * @Description:
 */
public class Solution69 {
    //Binary Search
    //5ms, 99.24%
    //32.3MB 99.01%
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sqrt = x / mid;
            if (sqrt == mid)
                return mid;
            else if (sqrt > mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    //牛顿迭代法
}
