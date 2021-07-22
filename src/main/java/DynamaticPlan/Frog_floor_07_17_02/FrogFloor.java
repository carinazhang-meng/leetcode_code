package DynamaticPlan.Frog_floor_07_17_02;

/**
 * @Author Zhangmengyan
 * @Date 17/07/2021
 * 动态规划的方法，和斐波那契数列类似
 **/
public class FrogFloor {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(NumWays(n));
    }

    public static int NumWays(int n) {
        if (n == 0 || n == 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] % 1000000007 + dp[i - 2] % 1000000007;
        }
        return dp[n - 1] % 1000000007;//防止溢出
    }
}
