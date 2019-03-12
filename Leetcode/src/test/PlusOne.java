package test;

import java.util.Arrays;
// 进位运算，把一个整数各个位上的值拆开放到一个数组中
public class PlusOne {
    public int[] plusOne(int[] digits)
    {
        int carry = 1;
        int index = digits.length-1;
        // 用的是while而不是for，可以减少不必要的循环，如当最后一位不是9时，就不用再执行循环了。
        while(carry==1 && index>=0)
        {
            digits[index] = (digits[index]+carry)%10; // 数组里的数范围肯定是在10以内，所以除10得余可以很好的来完成进位的操作
            carry = digits[index] == 0 ? 1:0;
            index--;
        }

        if(carry==1)
        {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
    public static void main(String[] args)
    {
        int[] digits = {9,9,9,9};
        PlusOne po = new PlusOne();
        System.out.println(Arrays.toString(po.plusOne(digits)));
    }
}
