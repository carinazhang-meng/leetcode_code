package ArrayList;

/**
 * @Author Zhangmengyan
 * @Date 25/08/2021
 * 合并有序数组
 **/
public class Concat_list_08_25 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 7};
        int[] a2 = {3, 4, 9};
    }

    private static void Method(int[] a1, int[] a2) {//时间复杂度为O(m+n)，空间复杂度为O(m+n)
        int pa = 0, pb = 0;
        int m = a1.length, n = a2.length;
        int[] res = new int[m + n];
        int cur;
        while (pa < m || pb < n) {
            if (pa == m) {
                cur = a2[pb++];
            } else if (pb == n) {
                cur = a1[pa++];
            } else if (a1[pa] < a2[pb]) {
                cur = a1[pa++];
            } else {
                cur = a2[pb++];
            }
            res[pa + pb - 1] = cur;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static void Method1(int[] a1, int[] a2) {
        int m = a1.length, n = a2.length;
        int pa = m - 1;
        int pb = n - 1;
        int[] res = new int[m + n];
        int cur = m + n - 1;
        while (pa >= 0 || pb >= 0) {
            if (pa == -1) cur = a2[pb++];
            else if (pb == -1) cur = a1[pa++];
            else if (a1[pa] > a2[pb]) cur = a1[pa];
            else cur = a2[pb];
            res[cur--] = cur;
        }
    }
}
