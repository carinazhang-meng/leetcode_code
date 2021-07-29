package Face_exercise.Level_Travel_07_24_03;

import java.util.ArrayList;

/**
 * @Author Zhangmengyan
 * @Date 24/07/2021
 **/
public class LevelTravel {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        System.out.println(levelOrder(n1));
    }

    public static ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        order(root, 0);
        return lists;
    }

    public static void order(TreeNode root, int level) {
        if (root == null) return;
        if (lists.size() <= level) {
            lists.add(new ArrayList<Integer>());
        }
        lists.get(level).add(root.val);
        order(root.left, level + 1);
        order(root.right, level + 1);
    }
}
/*
层次遍历：
1.先构建一个全局的链表，里面用来存放每一层的节点。
2.当链表大小小于层数大小的时候，每次构建一个链表，将根节点的结果添加到这一层的链表中。
3.遍历左子树，同时层数+1.
4.遍历右子树，同时层数加1
 */
//public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
// 使用队列完成层次遍历，时间较长。

//         ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();//用来存储输出的列表
//         if (root == null) return ans;
//         Queue<TreeNode> queue = new LinkedList<TreeNode> ();
//         queue.offer(root);

//         while(! queue.isEmpty()){
//             ArrayList<Integer> level = new ArrayList<Integer>();
//             int currentsize = queue.size();
//             while(currentsize > 0){
//                 TreeNode node = queue.poll();
//                 level.add(node.val);
//                 currentsize--;
//                 if (root.left != null){
//                     queue.offer(root.left);
//                 }
//                 if (root.right != null){
//                     queue.offer(node.right);
//                 }
//             }
//             ans.add(level);
//         }
//         return ans;

