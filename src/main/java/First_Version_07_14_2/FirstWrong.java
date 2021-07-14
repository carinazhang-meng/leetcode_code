package First_Version_07_14_2;

/**
 * @Author Zhangmengyan
 * @Date 14/07/2021
 **/
public class FirstWrong {
    public static void main(String[] args) {
        int data[] = new int[4];
        data[0] = 1;
        data[1] = 3;
        data[2] = 5;
        data[3] = 6;
        int target = 7;
        searchInsert(data, target);
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
        return left;
    }

}
