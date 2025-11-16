package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Issue46_Permute {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));;
    }
    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        int sum=1;int count=0;
        for(int i=len;i>0;i--){
            sum*=i;
        }
        HashSet<List<Integer>> res=new HashSet<>();
        while(count<sum){
            for (int i = 0; i < len; i++) {
                for (int j = (i+1)%len; j < len; j++) {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    List<Integer> list = new ArrayList<>();
                    for(int num:nums) list.add(num);
                    if(!res.contains(list)) count++;
                    res.add(list);
                }
            }
        }
        return new ArrayList<>(res);
    }
}