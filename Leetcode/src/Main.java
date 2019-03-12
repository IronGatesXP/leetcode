import LinkedList.ListNode;
import LinkedList.medium.AddTwoNumbersII_445;
import LinkedList.medium.LinkedListComponents_817;
import LinkedList.medium.OddEvenLinkedList328;
import LinkedList.medium.SplitLinkedListinParts_725;
import StringProblems.medium.WordSubsets_916;
import test.EnumTest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        Map<String, String> map = new HashMap<>();
        byte b = 3;
        int c = b + 1;
        String o1 = map.put("k1", "v1");
        String o2 = map.put("k1", "v2");
        System.out.println(o1);
        System.out.println(o2);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(2);
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
//        node3.setNext(node4);
//        System.out.println(OddEvenLinkedList328.oddEvenList(node1));
        System.out.println(WordSubsets_916.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"ec","oc","ceo"}));
    }
}

