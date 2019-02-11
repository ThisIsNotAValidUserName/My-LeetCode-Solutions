public class Solution53 {

    /**
     * Solution to LeetCode 53, complexity O(n)
     * Divide and Conquer?
     * @param nums
     * @return
     */

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            max = Math.max(max, sum);
        }

        return max;
    }

}
