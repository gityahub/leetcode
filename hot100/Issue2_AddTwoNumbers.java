package hot100;

public class Issue2_AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode((l1.val+l2.val)%10);
        ListNode temp=head;
        int flag= l1.val + l2.val >= 10?1:0;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null||l2!=null){
            if(l1==null){
                head.next=new ListNode((l2.val+flag)%10);
                flag=l2.val + flag>=10?1:0;
                l2=l2.next;
                head=head.next;
            }
            else if(l2==null){
                head.next=new ListNode((l1.val+flag)%10);
                flag=l1.val + flag>=10?1:0;
                l1=l1.next;
                head=head.next;
            }
            else {
                head.next=new ListNode((l1.val+l2.val+flag)%10);
                flag=l1.val+l2.val+flag>=10?1:0;
                head=head.next;
                l1=l1.next;
                l2=l2.next;
            }
        }
        if(flag==1){
            head.next=new ListNode(flag);
        }
        return temp;
    }
}
