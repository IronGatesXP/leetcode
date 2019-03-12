package test;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int[] ma = new int[m+n];
//        nums1 = Arrays.copyOf(nums1,m+n);
//
//        for(int i=0;i<n;i++)
//        {
//            nums1[m+i] = nums2[i];
//
//        }
//        Arrays.sort(nums1);
        for(int i=0;i<m;i++)
        {
            ma[i] = nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            ma[m+i] = nums2[i];
        }
        nums1 = ma;
        for(int a:nums1)
            System.out.println(a);


    }
    public static void main(String[] args)
    {
        int[] nums1 = {0};
        int[] nums2 = {1};
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1,0,nums2,1);
        // System.out.println(Arrays.toString(msa.merge(nums1,4,nums2,4)));
    }
}
