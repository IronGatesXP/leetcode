package LinkedList.medium;

import LinkedList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents_817 {
    public static int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        ListNode cur = head;
        int res = 0;
        while (cur != null) {
            if (set.contains(cur.val) && (cur.next == null || !set.contains(cur.next.val))) {
                res++;
            }
            cur = cur.next;
        }
        return res;
    }
}
