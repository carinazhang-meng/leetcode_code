package jishiti.Qianxin.Shengao;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zhangmengyan
 * @Date 07/08/2021
 * n个演员，需要组建舞蹈小队，三个人为一组，身高必须从小到大或者从大到小
 **/
public class FindHeight {
    static List<List<Integer>> r = new ArrayList<>();

    public static void main(String[] args) {
        int[] h = {1, 5, 3, 4, 2};
        Zhengxu(h, new ArrayList<>(), 0);
        Nixu(h, new ArrayList<>(), 0);
        System.out.println(r.size());
    }

    public static void Zhengxu(int[] h, ArrayList<Integer> l1, int s) {
        if (l1.size() == 3) {
            r.add(new ArrayList<>(l1));
            return;
        }
        for (int i = s; i < h.length; i++) {
            if (l1.contains(h[i]) || (!l1.isEmpty()) && h[i] < l1.get(l1.size() - 1)) continue;
            l1.add(h[i]);
            Zhengxu(h, l1, i + 1);
            l1.remove(l1.size() - 1);
        }

    }

    public static void Nixu(int[] h, ArrayList<Integer> l2, int s1) {
        if (l2.size() == 3) {
            r.add(new ArrayList<>(l2));
            return;
        }
        for (int i = s1; i < h.length; i++) {
            if (l2.contains(h[i]) || (!l2.isEmpty()) && h[i] > l2.get(l2.size() - 1)) continue;
            l2.add(h[i]);
            Zhengxu(h, l2, i + 1);
            l2.remove(l2.size() - 1);
        }

    }
}
/*
分别进行正序和逆序的排列。
使用列表。
(1)从第一个点开始遍历，如果链表中包含这个当前节点，列表不为空，或者当前节点小于链表的最后一个节点，就将这个点添加进去。长度为3时就添加到结果的列表中。
 */
