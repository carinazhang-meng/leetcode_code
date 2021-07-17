package CutString_07_17_01;

/**
 * @Author Zhangmengyan
 * @Date 17/07/2021
 * 贪心算法
 **/
public class CutString {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(CuttingRope(n));

    }

    public static int CuttingRope(int n) {
        if (n < 4) return n - 1;
        long res = 1;
        while (n > 4) {
            res = res * 3 % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }
}
