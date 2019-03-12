package test;

import java.util.Arrays;

public class nums {
    public void solution(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        int n = nums.length/2;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i*2];
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int[] nums ={1,4,3,2,8,9,11,11};
        test.nums ap = new nums();
        ap.solution(nums);
    }
}
