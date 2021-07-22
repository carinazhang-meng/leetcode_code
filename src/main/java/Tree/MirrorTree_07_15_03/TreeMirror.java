package Tree.MirrorTree_07_15_03;


/**
 * @Author Zhangmengyan
 * @Date 15/07/2021
 **/
public class TreeMirror {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(7);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(3);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(9);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        TreeNode t1 = a1;

        Mirror1(a1);
        System.out.println(a1.val);
    }

    public static void Mirror1(TreeNode B) {
        if (B == null) return;
        if (B.left == null && B.right == null) return;
        TreeNode temp = B.left;
        B.left = B.right;
        B.right = temp;
        if (B.left != null) {
            Mirror1(B.left);
        }
        if (B.right != null) {
            Mirror1(B.right);
        }

    }

    public static TreeNode Mirror(TreeNode A) {
        if (A == null) return null;
        TreeNode left = Mirror(A.left);
        TreeNode right = Mirror(A.right);
        A.left = right;
        A.right = left;
        System.out.println(A.val);
        return A;
    }
}
