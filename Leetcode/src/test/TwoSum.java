package test;

public class TwoSum {
    public int[] twoSum(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,3,7,9,9};
        int target = 10;
        TwoSum ts = new TwoSum();
        for(int i=0;i<ts.twoSum(nums,target).length;i++)
        {
            System.out.println(ts.twoSum(nums,target)[i]);
        }

    }
}
