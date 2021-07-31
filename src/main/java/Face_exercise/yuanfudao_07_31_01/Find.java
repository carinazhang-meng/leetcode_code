package Face_exercise.yuanfudao_07_31_01;

import java.util.List;
import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date
 **/
public class Find {
    public static void main(String[] args) {
        //int[] num = {1,6,3,4,5,2};
        //int[] ans = Find(num);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int[] num1 = new int[nums.length];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = Integer.parseInt(nums[i]);
        }
        int[] res = Find(num1);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] Find(int[] nums) {
        int l = 0, r = 1;
        int[] ans = new int[2];

        boolean match = false;
        while (r <= nums.length - 1) {
            if (nums[l] > nums[r]) {
                if (match == false) {
                    ans[0] = l;
                    match = true;
                } else {
                    ans[1] = r;
                }
            }
            l++;
            r++;
        }
        return ans;
    }

}
