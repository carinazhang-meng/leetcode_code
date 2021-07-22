package ArrayList.Order_Array_07_16_01;

/**
 * @Author Zhangmengyan
 * @Date 16/07/2021
 **/
public class OrderArraySquare {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = -4;
        nums[1] = -1;
        nums[2] = 0;
        nums[3] = 3;
        nums[4] = 10;
        int[] ans = sortedSquares(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                i++;
            } else {
                ans[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }

        return ans;
    }
}
