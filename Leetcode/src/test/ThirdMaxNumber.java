package test;
import java.util.Arrays;
public class ThirdMaxNumber {
    public int thirdMax(int[] nums) {
        int sign = 0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                sign++;
                if(sign==2)
                    return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args)
    {
        ThirdMaxNumber t = new ThirdMaxNumber();
        int[] nums = { 2, 3, 1};
        System.out.println(t.thirdMax(nums));
    }
}
