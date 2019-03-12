package StringProblems.medium;

public class OptimalDivision_553 {
    // a/b/c/d/e/f.... 的最大值，可以看作求b/c/d/e/f...的最小值，因为所有的数值到大于1，并且只要在b后任意地方加括号，都会导致有数从分母变为分子而导致结果变大。
    public static String optimalDivision(int[] nums) {
        if (nums.length == 1)
            return nums[0] + "";
        if (nums.length == 2)
            return nums[0] + "/" + nums[1];
        StringBuilder res = new StringBuilder(nums[0] + "/(" + nums[1]);
        for (int i = 2; i < nums.length; i++) {
            res.append("/" + nums[i]);
        }
        res.append(")");
        return res.toString();
    }
}
