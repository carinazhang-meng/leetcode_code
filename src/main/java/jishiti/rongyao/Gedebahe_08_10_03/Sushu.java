package jishiti.rongyao.Gedebahe_08_10_03;

import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 10/08/2021
 **/
public class Sushu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        int num1 = 0, num2 = n;
        while (b < n / 2) {
            if (Iszhi(b) && Iszhi(n - b)) {
                if (b >= n - b) {
                    num1 = b;
                    num2 = n - b;
                    break;
                }
            }
        }
        System.out.println(num1 + " " + num2);
    }

    public static boolean Iszhi(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
