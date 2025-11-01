package hot100;

import java.util.HashMap;

public class Issue138_CopyRandomList {
    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node,Node> map = new HashMap<Node, Node>();
        Node temp=head;
        Node ans = null;
        while(head!=null){
            map.put(head,new Node(head.val));
            head=head.next;
        }
        head=temp;
        while(head!=null){
            ans=map.get(head);
            ans.random=map.get(head.random);
            if(head.next==null){
                break;
            }
            ans.next=map.get(head.next);
            head=head.next;
        }
        return map.get(temp);
    }

    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
}
