package Merge_LinkedList_07_15_01;

/**
 * @Author Zhangmengyan
 * @Date 15/07/2021
 **/

public class Merge {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(4);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;
        m3.next = null;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        mergeTwoLists(n1, n2);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n1 = new ListNode(-1);
        ListNode p = n1;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        System.out.println(n1.next.val);
        return n1.next;
    }
}
