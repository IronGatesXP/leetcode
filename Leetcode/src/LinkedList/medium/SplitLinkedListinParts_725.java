package LinkedList.medium;

import LinkedList.ListNode;

import java.util.Arrays;

public class SplitLinkedListinParts_725 {
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode n = root;
        int len = 0;
        while (n != null) {
            len++;
            n = n.next;
        }
        int[] count = new int[k];
        Arrays.fill(count, len / k);
        for (int i = 0; i < len % k; i++) {
            count[i]++;
        }
        for (int i = 0; i < k; i++) {
            System.out.println(i);
        }
        ListNode[] res = new ListNode[k];
        ListNode cur = root;
        for (int i = 0; i < k; i++) {
            if (cur == null) {
                return res;
            }
            res[i] = cur;
            while (count[i] > 1) {
                cur = cur.next;
                count[i]--;
            }
            ListNode temp = cur.next;
            cur.next = null;
            cur = temp;
        }
        return res;
    }
}
