/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 11:26
 * @Description:
 */
public class Solution230 {
    //二叉搜索树中第K小的元素
    //1ms, 95.05%
    //35.8MB, 96.44%
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        ldr(root, k);
        return result;
    }

    public void ldr(TreeNode root, int k) {
        if (root == null)
            return;
        ldr(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        ldr(root.right, k);
    }
}
