package LinkedList.LinkedList_start_node_07_13_03;

/**
 * @Author Zhangmengyan
 * @Date 13/07/2021
 **/
//一、第一步是确定一个链表中是否有还
    //第二步是如何找到环的入口，用两个指针来解决。
public class RingStartNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x;}
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;
        int[] num1 = {1,3,4,5,6};
        ListNode head = new ListNode(0);
        ListNode prev = head;
        for(int i =0;i < num1.length;i++){
            ListNode node = new ListNode(num1[i]);
            prev.next = node;
            prev = node;
        }
        EntryNodeOfLoop(n1);
    }

    public  static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast=pHead;
        ListNode low=pHead;
        while(fast!=null&&fast.next!=null){
            //快的走两步，慢的走一步。当两个指针相遇时候说明该链表有环
            fast=fast.next;
            fast=fast.next;
            low=low.next;
            if(fast==low)
                break;
        }
        if(fast==null||fast.next==null) {
            System.out.println("null");
            return null;
        }
        low=pHead;
        while(fast!=low){
            fast=fast.next;
            low=low.next;
        }
        System.out.println(low.val);
        return low;
    }
}
