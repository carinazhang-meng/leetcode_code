package Face_exercise.AddSqrt_08_01_01;

import java.util.*;

/**
 * @Author Zhangmengyan
 * @Date 01/08/2021
 **/
public class Shares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            String[] nums = input.split(" ");
            //input = input.split(" ");
            int[] num = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                num[i] = Integer.parseInt(nums[i]);
            }
            double m = num[0];
            int n = num[1];
            System.out.println((String.format("%.2f", AddArray(m, n))));
        }
    }

    public static double AddArray(double m, int n) {
        Double s = 0.0;
        for (int i = 0; i < n; i++) {
            s += m;
            m = Math.sqrt(m);
        }
        return s;

    }
}
