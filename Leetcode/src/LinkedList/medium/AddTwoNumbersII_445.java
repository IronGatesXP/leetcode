package LinkedList.medium;

import LinkedList.ListNode;
import LinkedList.Util;

// 44.93%
// 自己创建函数的时候，传参时一定要考虑好，传进去的参数是通过值传递的，是否后面还需要用到这个数，如果用到的话就要把这个数返回重新赋值，否则他本来的值没变
public class AddTwoNumbersII_445 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = reverseList(l1);
//        Util.printList(rl1);
        ListNode rl2 = reverseList(l2);
//        System.out.println();
//        Util.printList(rl2);
//        System.out.println();
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;
        while (rl1 != null && rl2 != null) {
            int temp = rl1.val + rl2.val + carry;
            cur.next = new ListNode(temp % 10);
            carry = temp / 10;
            rl1 = rl1.next;
            rl2 = rl2.next;
            cur = cur.next;
        }
        // 一定要再次赋值，因为是值传递，在addNotNull函数中改变的cur不会影响目前你的cur
        carry = addNotNull(rl1, cur, carry);
        carry = addNotNull(rl2, cur, carry);
        System.out.println(carry);
        while (cur.next != null) {
            cur = cur.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
//        Util.printList(head.next);
//        System.out.println();
        Util.printList(reverseList(head.next));
        return reverseList(head.next);
    }
    private static ListNode reverseList(ListNode l) {
        if (l == null) {
            return l;
        }
        ListNode pre = l;
        ListNode cur = l.next;
        ListNode temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        l.next = null;
        return pre;
    }

    private static int addNotNull(ListNode l, ListNode cur, int carry) {
        if (l == null) {
            return carry;
        }
//        System.out.println(l.getVal());
//        System.out.println(carry + "carry");
        while (l != null) {
            if (carry == 0) {
                cur.next = l;
                return carry;
            } else {
                int temp =l.val + carry;
                cur.next = new ListNode(temp % 10);
                carry = temp / 10;
                l = l.next;
                cur = cur.next;
            }
        }
        return carry;
    }

    // 98.55%
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int len1 = getLen(l1);
        int len2 = getLen(l2);
        int N = Math.max(len1, len2);
        int[] a1;
        int[] a2;
        int[] res = new int[N + 1];
        a1 = listToArray(l1, N, len1);
        a2 = listToArray(l2, N, len2);
        int carry = 0;
        for (int i = N; i >= 0;) {
            int temp = a1[i] + a2[i] + carry;
            res[i--] = temp % 10;
            carry = temp / 10;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        if (res[0] == 1) {
            cur.next = new ListNode(1);
            cur = cur.next;
        }
        for (int i = 1; i < N + 1; i++) {
            cur.next = new ListNode(res[i]);
            cur = cur.next;
        }
        return head.next;
    }

    private static  int[] listToArray(ListNode l, int N, int len) {
        ListNode cur = l;
        int[] a = new int[N + 1];
        int index;
        if (len == N) {
            index = 1;
            while (cur != null) {
                a[index++] = cur.val;
                cur = cur.next;
            }
        } else {
            index = N + 1 - len;
            while (cur != null) {
                a[index++] = cur.val;
                cur = cur.next;
            }
        }
        return a;
    }

    private static int getLen(ListNode l) {
        int len = 0;
        ListNode cur = l;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

}
