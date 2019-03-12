package test;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows==0)
            return triangle;
        // 把第一行单独提出来的原因，因为从第二行开始都是有规律：首尾都为1，其他数都从上一行之和得到，虽然第二行不用从第一行之和得到，但它满足首尾都是1的规律
        triangle.add(new ArrayList<Integer>());

        triangle.get(0).add(1);
////        for(int i=1;i<numRows;i++)
////        {
////            triangle.add(new ArrayList<Integer>());// 为每一行建一个List
////            triangle.get(i).add(1);// 将首个数的值定为1
////            for(int j=1;j<i;j++)
////            {
////                int tmp = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
////                triangle.get(i).add(tmp);
////            }
////            triangle.get(i).add(1);
////        }
        for(int i=1;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prerow = triangle.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(prerow.get(j-1)+prerow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }


        return triangle;
    }

    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        System.out.println(t.generate(5));
    }
}
