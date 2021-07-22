package Face_exercise.Quick_Sort_07_20_01;

/**
 * @Author Zhangmengyan
 * @Date 20/07/2021
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 20;
        num[1] = 5;
        num[2] = 2;
        num[3] = 30;
        num[4] = 10;
        qsort(num, 0, 4);
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }


    }

    public static int qsort(int[] num, int left, int right) {
        int l = left;
        int r = right;
        int x = num[l];
        while (l < r) {
            while (l < r && num[r] > x) r--;
            if (l < r) {
                num[l++] = num[r];
            }
            while (l < r && num[l] < x) l++;
            if (l < r) {
                num[r--] = num[l];
            }

            num[l] = x;
            qsort(num, left, right - 1);
            qsort(num, left + 1, right);
        }
        return 0;
    }
}
