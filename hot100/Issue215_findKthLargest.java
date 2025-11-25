package hot100;

import java.util.PriorityQueue;

public class Issue215_findKthLargest {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            heap.add(i);
        }
        for(int i=0;i<k-1;i++){
            heap.poll();
        }
        return heap.peek();
    }
}
