package StachQueue_07_18_03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Zhangmengyan
 * @Date 18/07/2021
 **/
public class StackQueue {
    static class CQueue {
        LinkedList<Integer> A, B;

        public CQueue() {
            A = new LinkedList<Integer>();
            B = new LinkedList<Integer>();
        }

        public void appendTail(int value) {
            A.addLast(value);
        }

        public int deleteHead() {
            if (!B.isEmpty()) {
                return B.removeLast();
            }
            if (A.isEmpty()) {
                return -1;
            }
            while (!A.isEmpty()) {
                B.addLast(A.removeLast());
            }
            return B.removeLast();
        }
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());

    }

}
