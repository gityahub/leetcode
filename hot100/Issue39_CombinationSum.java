package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Issue39_CombinationSum {
    public static void main(String[] args) {

    }
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracing(candidates,0,target,0);
        return res;
    }
    public void backtracing(int[] candidates,int sum,int target,int index){
        if(sum>target){
            return;
        }
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(sum+candidates[i]>target) return;
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracing(candidates,sum,target,i);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
