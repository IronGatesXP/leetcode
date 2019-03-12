package test;

import java.util.Arrays;

public class SumTwo {
    public int[] twoSum(int[] numbers, int target) {
       int start = 0;
       int end = numbers.length - 1;
       while(start<end)
       {
           if(numbers[start] + numbers[end] == target)
               break;
           if(numbers[start] + numbers[end] > target)
               end--;
           else
               start++;
       }
       return new int[]{start+1,end+1};

    }

    public static void main(String[] args)
    {
        SumTwo t = new SumTwo();
        int[] numbers = {-1,0};

        System.out.println(Arrays.toString(t.twoSum(numbers,-1)));
    }
}
