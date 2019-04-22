/**
 * @Auther: Di Zhu
 * @Date: 04-19-2019 18:17
 * @Description:
 */
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return head;
        ListNode p1 = head;
        ListNode p2 = head;
        //Odd and even
        //p1 moves on node per step, p2 moves two nodes per step
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }
}
