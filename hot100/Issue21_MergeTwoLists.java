package hot100;

public class Issue21_MergeTwoLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode temp;
        if (list1.val <= list2.val) {
            temp=list1;
            list1=list1.next;
        }
        else {
            temp=list2;
            list2=list2.next;
        }
        ListNode ans = temp;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else {
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
            temp=temp.next;
            list1=list1.next;
        }
        else {
            temp.next=list2;
            temp=temp.next;
            list2=list2.next;
        }
        return ans;
    }
}
