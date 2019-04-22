/**
 * @Auther: Di Zhu
 * @Date: 04-19-2019 17:55
 * @Description:
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
        if  (node == null || node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
