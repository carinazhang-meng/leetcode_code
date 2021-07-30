package Face_exercise.Max_Subarray_07_30_01;

/**
 * @Author Zhangmengyan
 * @Date 30/07/2021
 **/
public class MaxArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(nums[i], res);
        }
        return res;
    }
}
/*
输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)，空间复杂度为O（1）
1.将原本的数组变成一个保存着最大子数组的和的数组。
2.当前一个子数组小于0的时候，不加到一起。

 */
