package LinkedList.Judge_07_22;

/**
 * @Author Zhangmengyan
 * @Date  22/07/2021
 **/
public class Judge {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(4);
        n1.next = n2;n2.next = n3;n3.next=n4;n4.next = n2;

    }
    public static boolean hasCycle(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
