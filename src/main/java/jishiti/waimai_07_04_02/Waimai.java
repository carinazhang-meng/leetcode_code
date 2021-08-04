package jishiti.waimai_07_04_02;

import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 04/08/2021
 **/
public class Waimai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Waimai(a, b);
    }

    public static int Waimai(int m, int n) {
        int[] time = new int[n + 1];
        for (int i = 1; i < m; i++) {
            time[i] = m - i;
        }
        for (int j = m + 1; j <= n; j++) {
            if (j % 2 == 0) {
                time[j] = Math.min(time[j / 2], time[j - 1]) + 1;
            } else {
                time[j] = Math.min(Math.min(time[(j + 1) / 2] + 2, time[(j - 1) / 2] + 2), time[j - 1] + 1);
            }
        }

        return time[n];
    }
}
/*
输入所在楼层N,可以通过步梯向上到达B+1,或者N-1,或者乘坐电梯到N*2,到达楼层M的最短时间。
1.构建一个序列的大小为2*（m，n）里面最大的值
2.其中全部用最大值填满，也就是走的最大时间。
3.0-外卖员所在的层，全部以步行梯的结果为代替。
4.外卖员到目标层的过程中，判断是否能被2整除，如果能整除，则判断
 */