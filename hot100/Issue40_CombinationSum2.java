package hot100;

import java.util.*;

public class Issue40_CombinationSum2 {
    public static void main(String[] args) {

    }
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracing(candidates,target,0,0);
        return res;
    }
    void backtracing(int[] candidates, int target,int sum,int startIndex){
        if(sum>target) return;
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<candidates.length;i++){
            if(sum+candidates[i]>target) break;
            if(i>startIndex&&candidates[i]==candidates[i-1]) continue;
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracing(candidates,target,sum,i+1);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
