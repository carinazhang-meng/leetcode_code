package Face_exercise.Reverse_07_29_02;

/**
 * @Author Zhangmengyan
 * @Date 29/07/2021
 **/
public class Reverse {
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println(solve(s1));

    }

    public static String solve(String str) {
        char[] ans = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char tmp = ans[i];
            ans[i++] = ans[j];
            ans[j--] = tmp;

        }
        return new String(ans);
    }
}
