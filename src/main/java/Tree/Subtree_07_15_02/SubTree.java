package Tree.Subtree_07_15_02;

/**
 * @Author Zhangmengyan
 * @Date 15/07/2021
 **/
public class SubTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(2);
        TreeNode b1 = new TreeNode(4);
        TreeNode b2 = new TreeNode(1);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        //b1.left = b2;
        isSubtree(a1, b1);
    }

    public static boolean isSubtree(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            System.out.println("false");
            return false;
        }
        if (A.val == B.val && recur(A.left, B.left) && recur(A.right, B.right)) {
            System.out.println("true");
            return true;
        }
        return isSubtree(A.left, B) || isSubtree(A.right, B);
    }

    public static boolean recur(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            //System.out.println("false");
            return false;
        }
        if (root2 == null) {
            //System.out.println("false");
            return false;
        }
        if (root1.val == root2.val) {
            return recur(root1.left, root2.left) && recur(root1.right, root2.right);
        } else {
            //System.out.println("false");
            return false;
        }
    }
}
