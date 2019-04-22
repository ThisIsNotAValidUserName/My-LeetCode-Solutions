/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 10:53
 * @Description:
 */
public class Solution209 {
    //长度最小的子数组
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = 0, result = 0;
        int i = 0, j = 0;
        for ( ; j < nums.length ; j++) {
            if (sum >= s)
                break;
            sum += nums[j];
        }
        if (j == nums.length && sum < s)
            return 0;
        sum -= nums[--j];

    }
}
