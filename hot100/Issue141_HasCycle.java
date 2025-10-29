package hot100;

public class Issue141_HasCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (slow.next != null) {
            slow = slow.next;
            if (fast.next == null||fast.next.next==null) return false;
            else if(fast.next.next != null) {
                fast = fast.next.next;
            }
            if(slow == fast) {return true;}
        }
        return false;
    }
}
