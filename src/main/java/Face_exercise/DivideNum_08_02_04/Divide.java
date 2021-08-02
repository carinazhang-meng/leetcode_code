package Face_exercise.DivideNum_08_02_04;

/**
 * @Author Zhangmengyan
 * @Date 02/08/2021
 **/
public class Divide {
    public static void main(String[] args) {
        int n = 5, k = 3;
        Method(n, k);
    }

    public static void Method(int n, int k) {
        int i, j;
        int a[][] = new int[201][7];
        a[0][0] = 1;
        for (i = 1; i <= n; i++)
            a[i][1] = 1;
        for (i = 1; i <= n; i++)//i是0-n之间的所有数的情况
        {
            for (j = 1; j <= k; j++)//j是k个数中，每一位的数的结果
                if (i >= j)//a[i][j]是可以将i分成j份
                    a[i][j] = a[i - j][j] + a[i - 1][j - 1];//a[i-j][j]是先给j个数字一人分配一个剩余的再分，而a[i-1][j-1]是为了保证拿的不小于上一个
        }
        System.out.println(a[n][k]);
    }
    /*
    划分数，将整数n划分成k份，且每份不能为空。
    例子：n=7,k=3 ，输出为4
    用动态规划的思想来做。
     */
}
