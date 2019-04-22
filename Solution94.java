import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 11:50
 * @Description:
 */
public class Solution94 {
    //二叉树的中序遍历

    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        recursive(root);
        return list;
    }

    public void nonRecursive(TreeNode root) {

    }

    //1ms, 94.66%
    //34.2MB, 60.86%
    public void recursive(TreeNode root) {
        if (root == null)
            return;
        recursive(root.left);
        list.add(root.val);
        recursive(root.right);
        //list.add(root.val);
    }
}
