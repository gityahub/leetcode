package hot100;

public class Issue24_SwapPairs {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode ans = head.next;
        ListNode prev = null;
        while (head != null && head.next != null) {
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = head;
            if (prev != null) {
                prev.next = temp;
            }
            prev = head;
            head = head.next;
        }
        return ans;
    }

}
