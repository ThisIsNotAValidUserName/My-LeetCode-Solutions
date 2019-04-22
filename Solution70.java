/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 23:47
 * @Description:
 */
public class Solution70 {
    //执行用时 : 1 ms, 在Climbing Stairs的Java提交中击败了82.07% 的用户
    //内存消耗 : 32.3 MB, 在Climbing Stairs的Java提交中击败了86.42% 的用户
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            int[] ans = new int[n];
            ans[0] = 1;
            ans[1] = 2;
            for(int i=2;i<n;i++) {
                ans[i]=ans[i-1]+ans[i-2];
            }
            return ans[n-1];
        }
    }
}
