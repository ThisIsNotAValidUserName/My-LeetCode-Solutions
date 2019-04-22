import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: Di Zhu
 * @Date: 04-19-2019 18:22
 * @Description:
 */
public class Solution141 {
    /*** 14ms, 16.35% ***/
    /*** 42.3mb, 7.05% ***/
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode p = head;
        Set<ListNode> nodes = new HashSet<>();
        while (p != null) {
            if (nodes.contains(p))
                return true;
            nodes.add(p);
            p = p.next;
        }
        return false;
    }

    /*** 1ms, 90.98% ***/
    /*** 38.5mb, 77.27% ***/
    public boolean hasCycleTwoPointers(ListNode head) {
        if (head == null)
            return false;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            p1 = p1.next;

            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }
}
