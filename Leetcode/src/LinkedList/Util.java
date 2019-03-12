package LinkedList;

public class Util {
    public static void printList(ListNode l) {
        while (l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }
    }
}
