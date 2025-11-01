package hot100;

public class Issue25_ReverseKGroup {
    public static void main(String[] args) {

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode slow=dummyHead;
        ListNode fast=dummyHead;
        while(slow.next!=null){
            int count=0;
            while(count<k){
                if(fast.next==null) return dummyHead.next;
                count++;
                fast=fast.next;
            }
            ListNode start = slow.next;
            ListNode end = fast.next;
            slow.next = reverseList(start, end);
            start.next = end;
            slow=start;
            fast=slow;
        }
        return dummyHead.next;
    }
    public ListNode reverseList(ListNode head,ListNode last) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != last) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
