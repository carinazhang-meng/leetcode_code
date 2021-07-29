package Face_exercise.k_number_07_22_01;

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
/*
使用了快排的方法，使用两个指针从两头开始，
1.若右指针的结果大于界定值，右指针左移。一直移动到右指针小于界定值。
2.右指针小于界定值，将右指针的结果给与左指针，同时左指针++。
3.若左指针的结果小于界定值，左指针右移。一直移动到左指针大于界定值。
4.左指针大于界定值，将左指针的结果给与右指针，同时右指针--。
5.最后将界定值给了左指针的位置。
6.判断此时左指针的位置是否和k相同，因为左指针左边的肯定比界定值小，右边的肯定比界定值大。因此不需要整个数组完全快排结束。即可获得第k个数。
 */

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