/**
 * @Auther: Di Zhu
 * @Date: 04-19-2019 18:08
 * @Description:
 */
/*** 删除链表的倒数第N个节点 ***/
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        //Move p2 to n + 1 th node
        for (int i = 0 ; i < n ; i++) {
            p2 = p2.next;
        }

        //n equals to length of the link list
        if (p2 == null) {
            p1 = head.next;
            return p1;
        }

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.next = p1.next.next;
        return head;
    }
}
