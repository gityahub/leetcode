package hot100;

import java.util.ArrayList;
import java.util.List;

public class Issue78_Subsets {
    public static void main(String[] args) {

    }
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path = new ArrayList<>();
        backtrack(path,nums,nums.length,0);
        return list;
    }
    public void backtrack(List<Integer> path,int []nums, int len, int index){
        if(index==len) return;
        for(int i=index;i<len;i++){
            path.add(nums[i]);
            backtrack(path,nums,len,i+1);
            path.remove(path.size()-1);
        }
        list.add(new ArrayList<>(path));
    }
}
