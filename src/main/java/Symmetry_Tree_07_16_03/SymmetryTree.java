package Symmetry_Tree_07_16_03;

/**
 * @Author Zhangmengyan
 * @Date 16/07/2021
 **/
public class SymmetryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(8);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        System.out.println(IsSymmetry(n1));

    }

    public static boolean IsSymmetry(TreeNode root) {
        return Symmetry(root, root);

    }

    public static boolean Symmetry(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return Symmetry(root1.left, root2.right) && Symmetry(root1.right, root2.left);
    }
}
