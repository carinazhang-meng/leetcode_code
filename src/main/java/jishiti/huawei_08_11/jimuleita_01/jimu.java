package jishiti.huawei_08_11.jimuleita_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 11/08/2021
 **/
public class jimu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.replace("]", "").replace("[", "").split(",");
        int[][] nums = new int[str.length / 2][2];
        int i = 0;
        int j = 0;
        while (i <= str.length - 2) {
            int a = Integer.parseInt(str[i].trim());
            int b = Integer.parseInt(str[i + 1].trim());
            nums[j] = new int[]{a, b};
            i += 2;
            j++;
        }
        if (nums.length <= 10000) {
            int count = getNum(nums);
            System.out.println(count);
        }
    }

    public static int getNum(int[][] nums) {
        int count = 1;
        int max = Integer.MIN_VALUE;
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums, (o1, o2) -> {
            if (Math.min(o2[0], o2[1]) == Math.min(o1[0], o1[1])) {
                return Math.max(o2[0], o2[1]) - Math.max(o1[0], o1[1]);
            }
            return Math.min(o2[0], o2[1]) - Math.min(o1[0], o1[1]);
        });
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i][0] >= nums[i + 1][0] && nums[i][1] >= nums[i + 1][1] ||
                    nums[i][0] >= nums[i + 1][1] && nums[i][1] >= nums[i + 1][0]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }


}
