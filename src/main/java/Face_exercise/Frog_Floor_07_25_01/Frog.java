package Face_exercise.Frog_Floor_07_25_01;

/**
 * @Author Zhangmengyan
 * @Date 25/07/2021
 **/
public class Frog {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(jumpFloor(n));
    }

    public static int jumpFloor(int target) {
        if (target == 1 || target == 0) return 1;
        int[] dp = new int[target];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < target; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[target - 1];

    }
}
