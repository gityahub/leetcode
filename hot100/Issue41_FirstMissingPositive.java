package hot100;

import java.util.HashSet;

public class Issue41_FirstMissingPositive {
    public static void main(String[] args) {

    }
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()==1&&nums[0]==1)return 2;
        for(int i=0;i<nums.length+1;i++){
            if(!set.contains(i+1)){
                return i+1;
            }
        }
        return 0;
    }
}
