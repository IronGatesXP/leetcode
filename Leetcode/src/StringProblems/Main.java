package StringProblems;

import StringProblems.Easy.*;
import StringProblems.medium.*;
import test.LengthOfLastWord;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XP
 * @date 2018/11/4 14:11
 */
public class Main {
    public static void main(String[] args) {
//        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        String[] banned = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<String> list = new ArrayList<>();
        list.add("05:31");
        list.add("22:08");
        list.add("00:35");
        System.out.println(FindAndReplaceinString_833.findReplaceStringOpti2("abcd", new int[]{0, 2}, new String[]{"a","cd"}, new String[]{"eee","ffff"}));
    }
}

