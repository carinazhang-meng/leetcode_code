package ArrayList.Revolve_Array_07_16_02;

/**
 * @Author Zhangmengyan
 * @Date 16/07/2021
 **/
public class RevolveArray {
    public static void main(String[] args) {
        int[] nums = new int[7];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        Revovle(nums, 0, nums.length - 1);
        Revovle(nums, 0, k - 1);
        Revovle(nums, k, nums.length - 1);

    }

    public static void Revovle(int[] nums, int i, int j) {
        while (i < j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
    //使用了额外的数组存储空间，导致空间复杂度为n
//    public static int rotate(int[] nums, int k) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        int j = 0;
//        for(int i =n-k;i<n;i++){
//            ans[j] = nums[i];
//            j++;
//        }
//        for (int i = 0;i<n-k;i++){
//            ans[k] = nums[i];
//            k++;
//        }
//        return ans;
    //使用翻转函数，先把整体反转，再把k左边的全部反转，再把k右边的全部反转。

}
