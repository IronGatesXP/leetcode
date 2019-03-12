package test;

public class MaxinumSubarray {
    public int maxSubArray(int[] nums) {
//        int max = (int)-Math.pow(2,31);
//        System.out.println(max);
//        for(int i=0;i<nums.length;i++)
//        {
//            int smax = (int)-Math.pow(2,31);
//
//            for(int j=0;j<nums.length-i;j++)
//            {
//                int sum = 0;
//                // int[] ms2 = new int[nums.length-i];
//                for(int k=j;k<j+i+1;k++)
//                {
//                    sum += nums[k];
//                    if(sum>smax)
//                        smax = sum;
//                }
//            }
//            if (smax>max)
//                max = smax;
//        }
//        return max;
        int max = Integer.MIN_VALUE, sum = 0;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;

    }
    public static void main(String[] args)
    {
        int[] nums = {-2147483647};
        MaxinumSubarray ms = new MaxinumSubarray();
        System.out.println(ms.maxSubArray(nums));
    }
}
