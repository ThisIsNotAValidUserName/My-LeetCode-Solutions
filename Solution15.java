import java.util.*;

/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 12:20
 * @Description:
 */
public class Solution15 {
    /***
     执行用时 : 94 ms, 在3Sum的Java提交中击败了59.33% 的用户
     内存消耗 : 55.2 MB, 在3Sum的Java提交中击败了74.45% 的用户
     ***/
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 0 || nums[0] > 0)
            return lists;
        for (int i = 0 ; i < nums.length ; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int target = 0 - nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < target) {
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    j++;
                } else {
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    k--;
                }
            }

        }
        return lists;
    }
}
