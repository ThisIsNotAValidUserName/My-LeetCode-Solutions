/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 23:58
 * @Description:
 */
public class Solution543 {
    // find out the max of leftDepth & rightDepth while at each node,
    // meanwhile update the total max.
    //Recursive
    //执行用时 : 2 ms, 在Diameter of Binary Tree的Java提交中击败了92.04% 的用户
    //内存消耗 : 36 MB, 在Diameter of Binary Tree的Java提交中击败了89.36% 的用户
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }
}
