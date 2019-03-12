package test;

import java.util.Arrays;

public class SearchInsertPositon {

        public int searchInsert(int[] nums, int target) {
            int i=0;
            for(;i<nums.length;)
            {
                if(nums[i]!=target)
                {
                    if(target>nums[i])
                        i++;
                    else
                        return i;
                }
                else
                    return i;
            }
            return i;

        }

    public static void main(String[] args)
    {
        int[] nums = {1,3,5,6};
        int target = 5;
        SearchInsertPositon sip = new SearchInsertPositon();
        int position = sip.searchInsert(nums,target);

        System.out.println(position);
        System.out.println(Arrays.toString(nums));
    }
}
