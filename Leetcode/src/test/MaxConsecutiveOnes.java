package test;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int preZero = -1;
        int lastZero = nums.length;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 0){
                if((i - preZero - 1) > maxLen)
                    maxLen = i - preZero - 1;

                preZero = i;
            }
        }
        if((lastZero - preZero - 1) > maxLen)
            maxLen = lastZero - preZero - 1;
        return maxLen;
    }
    public static void main(String[] args)
    {
        MaxConsecutiveOnes t = new MaxConsecutiveOnes();
        int[] nums = {1,1,1,1,1,1,1,1,1};
        System.out.println(nums.length);
        System.out.println(t.findMaxConsecutiveOnes(nums));
    }
}
