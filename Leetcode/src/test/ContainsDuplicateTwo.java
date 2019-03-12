package test;

public class ContainsDuplicateTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length-k;i++){
            if(nums[i]==nums[i+k])
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        ContainsDuplicateTwo t = new ContainsDuplicateTwo();
        int[] nums = {-1,2,0,2};
        System.out.println(t.containsNearbyDuplicate(nums,1));
    }
}
