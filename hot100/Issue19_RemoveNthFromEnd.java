package hot100;

public class Issue19_RemoveNthFromEnd {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int i=0;ListNode temp=head;
        while(head!=null){
            i++;
            head=head.next;
        }
        int length=i;
        head=temp;
        if (length == n) return head.next;
        for (i = 1; i < length - n; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }
}
