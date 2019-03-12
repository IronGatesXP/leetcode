package test;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args)
    {
        int[] nums = {};
        int val = 3;
        int len =nums.length;

        int j = 0;

        for(int i=0;i<len;i++)
        {
            if(nums[i]!=val)
            {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println(j);
        System.out.println(Arrays.toString(nums));
    }
}
