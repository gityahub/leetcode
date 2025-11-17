import java.util.ArrayList;
import java.util.List;

public class Issue46_permute {
    public static void main(String[] args) {

    }
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean []used=new boolean[nums.length];
        backtracing(nums,0,used);
        return res;
    }
    public void backtracing(int[] nums,int index,boolean[]used){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            path.add(nums[i]);
            used[i]=true;
            backtracing(nums,i+1,used);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}
