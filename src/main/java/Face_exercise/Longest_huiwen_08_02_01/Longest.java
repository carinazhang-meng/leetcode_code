package Face_exercise.Longest_huiwen_08_02_01;

/**
 * @Author Zhangmengyan
 * @Date 02/08/2021
 **/
public class Longest {
    public static void main(String[] args) {
        String s = "abc1234321ab";
        int n = 12;
        System.out.println(getLongestPalindrome(s, n));

    }

    public static int getLongestPalindrome(String A, int n) {
        // write code here使用双指针
        boolean[][] dp = new boolean[n][n];
        int max = 0;
        for (int d = 0; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                int j = i + d;
                if (A.charAt(i) == A.charAt(j)) {
                    if (d == 0 || d == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j]) {
                        max = Math.max(max, d + 1);
                    }
                }
            }
        }
        return max;
    }
//    public static String longestsub(String s){
//        int len= s.length();
//        if (len < 2) return s;
//        int maxlen = 1;
//        int begin = 0;
//        boolean[][] dp = new boolean[len][len];
//        for(int i = 0; i < len;i++){
//            dp[i][i]  = true;
//        }
//        char[] charArray = s.toCharArray();
//        for(int L=2;L <=len;L++){
//            for(int i = 0;i <len;i++){
//                int j = L+i -1;
//                if (j >= len){
//                    break;
//                }
//                if (charArray[i] != charArray[j]){
//                    dp[i][j] = false;
//                }else {
//                    if (j-i <3){
//                        dp[i][j] = true;
//                    }else{
//                        dp[i][j] = dp[i+1][j-1];
//                    }
//                }
//                if (dp[i][j] && j-i+1 >maxlen){
//                    maxlen = j-i+1;
//                    begin = i;
//                }
//            }
//        }
//        return s.substring(begin,begin+maxlen);
//    }
}
/*
输出最大回文子串：
（1）动态规划 的方法，构建一个二维数组（用来保存当前的时候的字符串是否为回文子串），一个是设置不同的长度，一个是设置不同的位置。
（2）当头尾指针结果相同时，判断头尾指针之间的距离大小，如果为0或者1，则为回文子串，如果不是，则左右移动。
（3）最后输出结果最大的长度。
 */