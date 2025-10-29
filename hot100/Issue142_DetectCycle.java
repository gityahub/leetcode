package hot100;

import java.util.HashSet;

public class Issue142_DetectCycle {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {return null;}
        HashSet<ListNode> set = new HashSet<>();
        ListNode slow = head;
        while (slow.next != null) {
            if (set.contains(slow)) {return slow;}
            set.add(slow);
            slow = slow.next;
        }
        return null;
    }
}
