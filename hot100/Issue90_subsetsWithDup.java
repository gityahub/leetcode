package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Issue90_subsetsWithDup {
    public static void main(String[] args) {

    }
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,nums.length,0);
        return list;
    }

    public void backtrack(int []nums, int len, int index){
        list.add(new ArrayList<>(path));
        for(int i=index;i<len;i++){
            if(i>index&&nums[i]==nums[i-1])continue;
            path.add(nums[i]);
            backtrack(nums,len,i+1);
            path.remove(path.size()-1);
        }
    }
}
