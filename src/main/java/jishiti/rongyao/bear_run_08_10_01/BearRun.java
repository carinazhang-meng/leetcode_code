package jishiti.rongyao.bear_run_08_10_01;

import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 10/08/2021
 **/
public class BearRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(",", " ");
        String[] num = str.split(" ");
        int N = Integer.parseInt(num[0]), X = Integer.parseInt(num[1]), Y = Integer.parseInt(num[2]);
        if (X >= N) System.out.println(5);
        double s = 5 / (double) X; //一米要跑的时间
        int m = X - Y;//m表示每五分钟能前进多少米
        int res = 0;//res记录总共的时间
        while (m < N) {//N是剩余的路程
            if (N <= X) break;
            N = N - m;
            res += 5;
        }
        res += Math.ceil(N * s);//浮点数向上取整
        System.out.println(res);
    }

    public static void Time(int N, int X, int Y) {

    }
}
