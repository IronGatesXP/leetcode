package test;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;

    }
    public static void main(String[] args)
    {
        ContainsDuplicate t = new ContainsDuplicate();
        int[] nums = {-1,2,0,2};
        System.out.println(t.containsDuplicate(nums));
    }
}
