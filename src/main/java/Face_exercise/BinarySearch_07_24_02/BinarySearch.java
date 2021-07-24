package Face_exercise.BinarySearch_07_24_02;

/**
 * @Author Zhangmengyan
 * @Date 24/07/2021
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 5};
        int target = 4;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        // write code here
        int left = 0, right = nums.length - 1;
        if (nums.length == 0) return -1;
        int res = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] >= target) {
                right = mid;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;

    }
}
