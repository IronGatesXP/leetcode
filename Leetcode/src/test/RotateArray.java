package test;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        int[] tmp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            tmp[(i+k)%nums.length] = nums[i];// 利用余数来调整位置，因为是按顺序移动的所以可行
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = tmp[i];
        }



        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args)
    {
        RotateArray t = new RotateArray();
        int[] nums = {-1,2};
        t.rotate(nums,3);
    }
}
