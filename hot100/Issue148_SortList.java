package hot100;

public class Issue148_SortList {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode small_head=new ListNode(0);
        ListNode small_tail=small_head;
        ListNode big_head=new ListNode(0);
        ListNode big_tail=big_head;
        ListNode middle_head=new ListNode(0);
        ListNode middle_tail=middle_head;
        ListNode cur=head;
        int val=head.val;
        while(cur!=null){
            if(cur.val<val){
                small_tail.next=cur;
                small_tail=small_tail.next;
            }
            else if(cur.val>val){
                big_tail.next=cur;
                big_tail=big_tail.next;
            }
            else {
                middle_tail.next=cur;
                middle_tail=middle_tail.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur=next;
        }
        ListNode smallList=sortList(small_head.next);
        ListNode bigList=sortList(big_head.next);
        if(smallList!=null) {
            ListNode temp=smallList;
            while(temp.next!=null) temp=temp.next;
            temp.next=middle_head.next;
        }
        middle_tail.next=bigList;
        if(smallList!=null) return smallList;
        return middle_head.next;
    }

}
