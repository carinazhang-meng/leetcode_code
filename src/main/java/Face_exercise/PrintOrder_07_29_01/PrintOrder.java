package Face_exercise.PrintOrder_07_29_01;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

/**
 * @Author Zhangmengyan
 * @Date 29/07/2021
 **/
public class PrintOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        PrintOrder o1 = new PrintOrder();
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        root.left = root2;
        root.right = root3;
        int[][] res = o1.threeOrders(root);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.println(res[i][j]);
            }
        }
    }

    public int[][] threeOrders(TreeNode root) {
        // write code here
        ArrayList<Integer> l1 = new ArrayList<>();
        PreOrder(l1, root);
        int[][] res = new int[3][l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            res[0][i] = l1.get(i);
        }
        l1.clear();
        InOrder(l1, root);
        for (int i = 0; i < l1.size(); i++) {
            res[1][i] = l1.get(i);
        }
        l1.clear();
        PostOrder(l1, root);
        for (int i = 0; i < l1.size(); i++) {
            res[2][i] = l1.get(i);
        }
        return res;
    }

    public void PreOrder(ArrayList<Integer> l1, TreeNode root) {
        if (root != null) {
            l1.add(root.val);
            PreOrder(l1, root.left);
            PreOrder(l1, root.right);
        }
    }

    public void InOrder(ArrayList<Integer> l1, TreeNode root) {


        if (root != null) {
            InOrder(l1, root.left);
            l1.add(root.val);
            InOrder(l1, root.right);
        }
    }

    public void PostOrder(ArrayList<Integer> l1, TreeNode root) {
        if (root != null) {
            PostOrder(l1, root.left);
            PostOrder(l1, root.right);
            l1.add(root.val);
        }
    }
}
