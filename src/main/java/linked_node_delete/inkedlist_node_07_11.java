package linked_node_delete;

/**
 * @Author Zhangmegnyan
 * @Date 11/07/2021
 **/
//创建一个链表的类
class ListNode{
    int val;	//数值 data
    ListNode next;	// 结点 node

    ListNode(int x){	//可以定义一个有参构造方法，也可以定义一个无参构造方法
        val = x;
    }
    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }
    // 打印链表
    public void print() {
        System.out.print(this.val);
        if(this.next != null)
        {
            System.out.print("-->");
            this.next.print();
        }
    }
}

public class inkedlist_node_07_11 {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.print();
        while(l != null){
            deleteNode(l,2);
            l = l.next;
        }

    }
    public static ListNode deleteNode(ListNode head, int val){
        if(head.val == val) {
            System.out.println(head.next.val);
            return head.next;
        }
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        System.out.println();
        if(cur != null) pre.next = cur.next;
        System.out.println(head.val);
        return head;
    }
}
