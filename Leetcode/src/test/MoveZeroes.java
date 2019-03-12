package test;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args)
    {
        MoveZeroes t = new MoveZeroes();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        t.moveZeroes(nums);
    }
}
