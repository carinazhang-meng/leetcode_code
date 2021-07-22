package Tree.Binary_Search_07_14_1;

/**
 * @Author Zhangmengyan
 * @Date 14/07/2021
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int data[] = new int[6];
        data[0] = -1;
        data[1] = 0;
        data[2] = 3;
        data[3] = 5;
        data[4] = 9;
        data[5] = 12;
        int target = 9;
        Search(data, target);
    }

    public static int Search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        System.out.println("-1");
        return -1;
    }

}
