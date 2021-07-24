package Tree.Construct2_07_24_01;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Zhangmengyan
 * @Date 24/07/2021
 **/
public class ConstructTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        //ConstructT(pre,in);
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(ConstructT(pre, in).val);
        //System.out.println(c);
    }

    public static TreeNode ConstructT(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == root.val) {
                root.left = ConstructT(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = ConstructT(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        System.out.println(root.val);
        return root;
    }
}
