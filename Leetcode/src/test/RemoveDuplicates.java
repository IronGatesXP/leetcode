package test;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,2,3,4,4};
        int nlen = nums.length;
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                nlen--;
                nums[i] = nums[nums.length-1];
            }
        }
        Arrays.sort(nums);
        System.out.println(nlen);
        System.out.println(Arrays.toString(nums));
    }
}
