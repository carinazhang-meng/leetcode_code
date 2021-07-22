package LinkedList.LinkedList_Back_Node_07_13_02;


/**
 * @Author Zhangmengyan
 * @Date 13/07/2021
 **/
public class LinkedBackNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x;}
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        int k = 2;
        while(l1!= null){
            getKthFromEnd(l1,k);
            l1=l1.next;
        }

    }
    public static ListNode getKthFromEnd(ListNode head,int k){
        ListNode left = head;
        ListNode right = head;
        while(right != null){
            right = right.next;
            if (k>0){
                k--;
            }else{
                left = left.next;
            }
        }
        System.out.println(left.val);
        return left;
    }
}
