/**
 * @Auther: Di Zhu
 * @Date: 04-19-2019 17:58
 * @Description:
 */
public class Solution206 {
    //Loop
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;

            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // 逆转单链表，递归方法
    public ListNode reverseByRecursion(ListNode head) {
        // 第一个条件判断异常，第二个条件是结束递归
        if (null == head || null == head.next) {
            return head;
        }

        ListNode newHead = reverseByRecursion(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
