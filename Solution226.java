import java.util.Stack;

/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 13:27
 * @Description:
 */
public class Solution226 {
    //226. 翻转二叉树
    /**
     * 执行用时 : 1 ms, 在Invert Binary Tree的Java提交中击败了37.89% 的用户
     * 内存消耗 : 33.8 MB, 在Invert Binary Tree的Java提交中击败了55.47% 的用户
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public TreeNode invertTreeNonRecur(TreeNode root) {
        if (root == null)
            return root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() != 0) {
            TreeNode current = stack.pop();
            while (current != null) {
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;
                stack.push(current.left);
                stack.push(current.right);
            }
        }
        return root;
    }
}
