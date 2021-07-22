package k_number_07_22_01;

/**
 * @Author Zhangmengyan
 * @Date 22/07/2021
 **/
public class Findk {
    public static void main(String[] args) {
        //int[] a= {1,3,5,2,2};
        int[] a1 = {10, 10, 9, 9, 8, 7, 5, 6, 4, 3, 4, 2};
        int n = a1.length;
        int K = 3;
        findKth(a1, 0, n - 1, n - K);
        System.out.println(a1[n - K]);
    }

    public static int findKth(int[] a, int low, int high, int K) {
        int i = low;
        int j = high;
        int tmp = a[i];
        while (i < j) {
            while (i < j && a[j] >= tmp) {
                j--;
            }
            if (i < j && a[j] < tmp) {
                a[i++] = a[j];
            }
            while (i < j && a[i] <= tmp) {
                i++;
            }
            if (i < j && a[i] > tmp) {
                a[j--] = a[i];
            }
        }
        a[i] = tmp;
        if (i == K) return 0;
        if (i > K) findKth(a, low, i - 1, K);
        if (i < K) findKth(a, i + 1, high, K);
        return 0;
    }

}

//以下是我使用的方法，先进行快排，之后再返回a[n-K]
//public class Solution {
//    public int findKth(int[] a, int n, int K) {
//        qsort(a,0,n-1);
//        return a[n-K];
//    }
//    public int qsort(int[] a, int left, int right){
//        int l = left; int r = right;
//        int x = a[l];
//        while(l < r){
//            while(l < r && a[r] > x){
//                r--;
//            }
//            if (l < r){
//                a[l++] = a[r];
//            }
//            a[l] = x;
//            qsort(a,left,right-1);
//            qsort(a,left+1,right);
//        }
//        return 0;
//    }
//}