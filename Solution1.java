import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 23:41
 * @Description:
 */
public class Solution1 {
    //执行用时 : 6 ms, 在Two Sum的Java提交中击败了94.77% 的用户
    //内存消耗 : 38.7 MB, 在Two Sum的Java提交中击败了54.51% 的用户
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = target-nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }
}
