package test;
import java.util.ArrayList;
import java.util.List;

public class FindAllDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        // (nums[i]-1) % n求出了所有元素对应的下标，1对应0,2对应1...，重复的元素会对应同一个下标，再加上n来便于下一步的识别
        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
        // 因为nums[1]>=1,所以要使用nums[i] <= n作为判断条件
        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
        return res;
    }
}
