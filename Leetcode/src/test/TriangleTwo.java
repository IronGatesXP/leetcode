package test;

import java.util.ArrayList;
import java.util.List;

public class TriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>());
//        if(rowIndex==0)
//            return triangle.get(0);

        triangle.get(0).add(1);
        for(int i=1;i<rowIndex+1;i++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> prerow = triangle.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(prerow.get(j-1)+prerow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex);

    }
    public static void main(String[] args)
    {
        TriangleTwo t = new TriangleTwo();
        System.out.println(t.getRow(0));
    }
}
