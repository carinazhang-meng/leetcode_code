package LinkedList.Reverse_List_07_19_03;

/**
 * @Author Zhangmengyan
 * @Date 19/07/2021
 **/
public class ReverseList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode prev = Reverse(n1);
        while (prev != null) {
            System.out.println(prev.val);
            prev = prev.next;
        }

    }

    public static ListNode Reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
