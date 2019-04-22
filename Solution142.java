/**
 * @Auther: Di Zhu
 * @Date: 04-19-2019 18:33
 * @Description:
 */
public class Solution142 {
    //1ms, 98.24%
    //34.8MB, 34.17%
    public ListNode detectCycle(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        boolean hasCycle = false;

        while (null != p2.next && null != p2.next.next) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return null;
        }

        p2 = head;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
