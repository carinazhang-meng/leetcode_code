package jishiti.huawei_08_04.SameSubTree_08_04_03;

import java.util.*;

/**
 * @Author Zhangmengyan
 * @Date 04/08/2021
 **/
public class SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static Map<String, Integer> count;
    static String[] l;
    static List<String> ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        s1 = s1.replace("[", "").replace("]", "");
        l = s1.split(",");
        TreeNode root = BuildTree();
        if (CountLevel(root) < 5) {
            String nodes = findDuplicateSubtrees(root);
            System.out.println(nodes);
        } else {
            throw new ArithmeticException("树高必须小于5");
        }
    }

    public static String findDuplicateSubtrees(TreeNode root) {
        count = new HashMap<>();
        ans = new ArrayList<>();
        collect(root);
        return ans.toString();
    }

    public static String collect(TreeNode node) {
        if (node == null) return "null";
        String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
        count.put(serial, count.getOrDefault(serial, 0) + 1);//将每一个根节点和它的子树放入map中，如果有重复的，value值加一
        if (count.get(serial) == 2)
            ans.add(0, String.valueOf(node.val));
        if (ans.size() <= 1) {
            return "-1";
        }
        return serial;
    }

    public static TreeNode BuildTree() {
        if (l.length <= 0) {
            return null;
        }
        TreeNode[] Nodearray = new TreeNode[l.length];
        for (int i = 0; i < l.length - 1; i++) {
            if (!l[i].equals("null")) {
                if (0 >= Integer.parseInt(l[i]) || Integer.parseInt(l[i]) >= 10) {
                    throw new ArithmeticException("节点数值必须在0-10之间");
                }
                if (Nodearray[i] == null) {
                    Nodearray[i] = new TreeNode(Integer.parseInt(l[i]));
                }
                int idx = 2 * i + 1;
                if (idx <= l.length - 1 && !l[idx].equals("null")) {
                    Nodearray[idx] = new TreeNode(Integer.parseInt(l[idx]));
                    Nodearray[i].left = Nodearray[idx];
                } else {
                    Nodearray[i].left = null;
                }
                idx++;
                if (idx <= l.length - 1 && !l[idx].equals("null")) {
                    Nodearray[idx] = new TreeNode(Integer.parseInt(l[idx]));
                    Nodearray[i].right = Nodearray[idx];
                } else {
                    Nodearray[i].right = null;
                }
            }
        }
        return Nodearray[0];
    }

    public static int CountLevel(TreeNode root) {
        if (root == null) return 0;
        return Math.max(CountLevel(root.left), CountLevel(root.right)) + 1;
    }
}
//例子：[1,2,3,1,null,2,null,null,null,null,null,1,null,null,null]
/*
输入一个字符串，获得重复的子树
（1）首先根据层次遍历获得将字符串中每个数字读入，构建成树
（2）因为题目中要求树高 不能超过5，因此需要限制树高为5.超过5则输出错误。
（3）构建一个哈希表，用来存储子树以及出现的次数，如果出现过两次
将结果存储到数组中。

 */