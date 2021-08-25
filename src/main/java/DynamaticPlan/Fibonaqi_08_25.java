package DynamaticPlan;

/**
 * @Author Zhangmengyan
 * @Date 25/08/2021
 * 斐波那契数列（不能用递归，会超时）
 **/
public class Fibonaqi_08_25 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Method(n));
    }

    private static int Method(int n) {
        if (n == 0) return 0;
        int f01 = 0;
        int fn1 = 1;
        int tmp;
        for (int i = 2; i < n; i++) {
            tmp = f01 + fn1;
            f01 = fn1;
            fn1 = fn1 % 1000000007;
        }
        return fn1;
    }
}
