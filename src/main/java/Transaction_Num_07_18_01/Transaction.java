package Transaction_Num_07_18_01;

/**
 * @Author Zhangmengyan
 * @Date 18/07/2021
 * 动态规划，从右向左，f(i = f(i+1) + g(i,i+1)*f(i+2)),因为从右向左不会发生重复的子序列的问题。
 **/
public class Transaction {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(translateNum(12258));
    }

    public static int translateNum(int num) {
        String a = String.valueOf(num);
        int n = a.length();
        if (n < 0) return 0;
        int[] counts = new int[n];
        int count = 0;
        for (int i = n - 1; i >= 0; --i) {
            count = 0;
            if (i < n - 1) count = counts[i + 1];
            else count = 1;
            if (i < n - 1) {
                int digit1 = a.charAt(i) - '0';
                int digit2 = a.charAt(i + 1) - '0';
                int converted = digit1 * 10 + digit2;
                if (converted >= 10 && converted <= 25) {
                    if (i < n - 2) count += counts[i + 2];
                    else count += 1;
                }
            }
            counts[i] = count;
        }
        count = counts[0];
        return count;
    }

}

