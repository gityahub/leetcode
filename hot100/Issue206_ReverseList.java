package hot100;

public class Issue206_ReverseList{
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) { val = x; }
        ListNode(int x, ListNode next) { this.val = x; this.next = next; }
    }

    public ListNode reverseList(ListNode head)    {
        if(head==null || head.next==null) return head;
        ListNode temp1 = head;
        int []temp=new int [5000];
        int i=0;
        while(head!= null){
            temp[i++]=head.val;
            head=head.next;
        }
        head=temp1;
        i--;
        while(temp1!=null){
            temp1.val=temp[i--];
            temp1=temp1.next;
        }
        return head;
    }

}
