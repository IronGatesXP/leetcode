package test;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]!=i)
                return i;
        }
        return i;
    }
    public static void main(String[] args)
    {
        MissingNumber t = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(t.missingNumber(nums));
    }
}
