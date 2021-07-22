package Tree.Print_Tree_zhi_07_18_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Zhangmengyan
 * @Date 18/07/2021
 **/
public class PrintTreezhi {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(3);
        node1.left = node3;
        TreeNode node4 = new TreeNode(4);
        node1.right = node4;
        TreeNode node5 = new TreeNode(5);
        node2.left = node5;
        TreeNode node6 = new TreeNode(6);
        node2.right = node6;

        System.out.println(Print(root));
    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();//构建列表用于存储树的所有节点，根据先进先出的原则。层次遍历
        queue.offer(root);
        boolean reverse = false;//判断是否需要反转
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();//用列表来存储每一行的节点。
            //遍历所有节点。
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();//弹出一个节点
                if (node == null) continue;
                if (!reverse) list.add(node.val);
                else list.add(0, node.val);//每次加到0的位置就自动逆序了。
                queue.offer(node.left);
                queue.offer(node.right);
            }
            if (list.size() > 0) {
                res.add(list);
            }
            reverse = !reverse;
        }
        return res;
    }
}
