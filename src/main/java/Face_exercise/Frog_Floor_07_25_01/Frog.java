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
/*
动态规划的问题
1.当台阶为0或者1的时候，解决方案都为1.
2.当台阶大于2时，从2开始，因为每次有两种可能，一次跳一个台阶或者两个。
3.因为target是从0开始的，所以返回的是dp[target-1]
 */