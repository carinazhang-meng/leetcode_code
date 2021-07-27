package Face_exercise.MergeTwoLinkedList_07_27_02;

/**
 * @Author Zhangmengyan
 * @Date 27/07/2021
 **/
public class Merge {
    public static void main(String[] args) {
        int[] A = {4, 5, 6};
        int[] B = {1, 2, 3};
        int[] res = merge(A, 3, B, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] merge(int A[], int m, int B[], int n) {
        //首先B的第一个数字和A的第一个进行比较，如果比A的第一个小，那就和A的第一个数交换，
        int[] res = new int[m + n];
        int p1 = 0, p2 = 0;
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = B[p2++];
            } else if (p2 == n) {
                cur = A[p1++];
            } else if (A[p1] < B[p2]) {
                cur = A[p1++];
            } else {
                cur = B[p2++];
            }
            res[p1 + p2 - 1] = cur;
        }
//        for(int i =0; i <res.length; i++){
//            A[i] = res[i];
//        }
        return res;
    }

    public static int[] merge2(int A[], int m, int B[], int n) {
        int[] res = new int[m + n];
        int p1 = m - 1, p2 = n - 1;
        int cur;
        int tail = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = B[p2--];
            } else if (p2 == -1) {
                cur = A[p1--];
            } else if (A[p1] > B[p2]) {
                cur = A[p1--];
            } else {
                cur = B[p2--];
            }
            res[tail--] = cur;
        }
//        for(int i =0; i <res.length; i++){
//            A[i] = res[i];
//        }
        return res;
    }

}
/*
1.分别给两个数组设定两个指针。
2.判断如果第一个指针走到了头就说明只有p2<n,所以添加p2
3.判断两个指针所指大小，将小的添加进去。
 */
