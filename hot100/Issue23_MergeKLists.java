package hot100;

public class Issue23_MergeKLists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        if(len==0) return null;
        if(len==1) return lists[0];
        ListNode dummyHead=new ListNode(0);
        ListNode cur=dummyHead;
        while(true){
            int index=-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<len;i++){
                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    index = i;
                }
            }
            if(index==-1) break;
            ListNode temp=lists[index];
            lists[index]=lists[index].next;
            cur.next=temp;
            cur=cur.next;
        }
        return dummyHead.next;
    }
}
