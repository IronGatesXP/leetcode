package test;
// 找出一个数组中后面的数减去前面的数的最大差值
// 关键：找出最小值，并与后面的数作差，使用for循环就保证了后面的数减前面的数
public class Stock {
    public int maxProfit(int[] prices) {
//        int max = 0;
//        for(int i=prices.length-1;i>0;i--)
//        {
//            for(int j=i-1;j>=0;j--)
//            {
//                if(prices[i]-prices[j]>max)
//                    max = prices[i] - prices[j];
//            }
//        }
//        return max;

        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i]-minPrice>max)
                max = prices[i] - minPrice;
        }
        return max;

    }
    public static void main(String[] args)
    {
        Stock t = new Stock();
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(t.maxProfit(prices));
    }
}
