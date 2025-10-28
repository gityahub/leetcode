package hot100;

public class Issue234_IsPalindrome {
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) { val = x; }
        ListNode(int x, ListNode next) { this.val = x; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        temp = head;
        for (int i = 0; i < size; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }
        int left = 0, right = size - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }




}
