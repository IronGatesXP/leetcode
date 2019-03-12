package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface  interfaceA {
    default void printA() {
        System.out.println("A");
    }
}

interface  interfaceB extends interfaceA{
    default void printB() {
        System.out.println("B");
    }
}
public class Test implements interfaceB{
    public void solution(int[] nums)
    {
        for(int j=0;j<5;j++)

        {
            for (int i = 0; i < 5; i++) {
                if (i == 3 && j == 2)
                    break;
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Test test = new Test();
        test.printA();
    }
}
