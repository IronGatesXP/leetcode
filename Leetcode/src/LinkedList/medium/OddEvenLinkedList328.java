package LinkedList.medium;

import LinkedList.ListNode;
import LinkedList.Util;

public class OddEvenLinkedList328 {
    public static ListNode oddEvenList(ListNode head) {
        ListNode[] evenA = jumpTwoNode(head);
        ListNode[] oddA = jumpTwoNode(head.next);
        evenA[1].next = oddA[0];
        Util.printList(evenA[0]);
        return evenA[0];
    }
    private static ListNode[] jumpTwoNode(ListNode l) {
        ListNode[] al = new ListNode[2];
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l != null) {
            cur.next = l;
            cur = cur.next;
            if (l.next != null) {
                l = l.next.next;
            } else {
                break;
            }
        }
        al[0] = head.next;
        al[1] = cur;
        return al;
    }

//    public static ListNode oddEvenList2(ListNode head) {
//        ListNode root = new ListNode(0);
////        ListNode headOdd = new ListNode(0);
////        ListNode cur = head;
//        while (head != null) {
//            root.next = head;
//        }
//    }
}
