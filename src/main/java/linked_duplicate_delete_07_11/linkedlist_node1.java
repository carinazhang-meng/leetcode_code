package linked_duplicate_delete_07_11;

/**
 * @Author Zhangmengyan
 * @Date 11/07/2021
 **/

public class linkedlist_node1 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;


        while(n1 != null){
            DeleteDuplicates(n1);
            n1 = n1.next;
        }
    }
    public static ListNode DeleteDuplicates(ListNode head){
        if (head == null){
            System.out.println(head.val);
            return head;
        }
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x){
                    cur.next = cur.next.next;
                }
            }
            else cur = cur.next;
        }
        System.out.println(dummy.next.val);
        return dummy.next;
    }
}
