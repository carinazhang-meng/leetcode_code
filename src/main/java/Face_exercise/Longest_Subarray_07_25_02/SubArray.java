package Face_exercise.Longest_Subarray_07_25_02;

/**
 * @Author Zhangmengyan
 * @Date 25/07/2021
 **/
public class SubArray {
    public static void main(String[] args) {
        int[] num = {2, 2, 3, 4, 3};
        System.out.println(maxLength(num));
    }

    public static int maxLength(int[] arr) {
        int result = 0, start = 0;
        int[] end = new int[40000];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (start < end[num]) {
                start = end[num];
            }
            if (result < i - start + 1) {
                result = i - start + 1;
            }
            end[num] = i + 1;
        }
        return result;
    }

}
