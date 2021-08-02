package Face_exercise.FindBalance_08_02_02;

/**
 * @Author Zhangmengyan
 * @Date 02/08/2021
 **/
public class Find {
    public static void main(String[] args) {
        int[] nums = {7, -7, 1, 5, 2, -5, 1, 3};
        System.out.println(FindIndex(nums));
    }

    public static int FindIndex(int[] nums) {
        int n = nums.length - 1;
        boolean flag = false;
        int index1 = 0;
        for (int i = 1; i <= n; i++) {
            nums[i] += nums[i - 1];//nums数组里装的是前i个数的所有的和
        }
        //System.out.println(nums);
        for (int j = 1; j <= n; j++) {
            if (j == 1 && (nums[n] - nums[0] == 0)) {
                index1 = j;
            } else if (j == n && nums[n - 1] == 0) {
                index1 = j;
            } else if (nums[j - 1] == nums[n] - nums[j]) {
                index1 = j;
            }
        }
        return index1;
    }
}
/*
求平衡点的index，左右之和相等。
1.将数组全部加和到一起，数组中存储的是前面所有数字的和。
2.考虑到平衡点是第一个点，最后一个点的情况。
 */

