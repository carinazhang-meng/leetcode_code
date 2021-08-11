package jishiti.huawei_08_11.yasuo_02;

/**
 * @Author Zhangmengyan
 * @Date 11/08/2021
 **/
public class Yasuo {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(Ya(s));
    }

    public static String Ya(String S) {
        if (S.length() == 0) { // 空串处理
            return S;
        }
        StringBuffer ans = new StringBuffer();
        int cnt = 1;
        char ch = S.charAt(0);
        int i = 1;
        if (S.charAt(0) != S.charAt(1)) {
            while (S.charAt(0) != S.charAt(i)) {
                i++;
            }
            System.out.println(i);
            int l = S.length() / i;
            S = S.toUpperCase();
            for (int k = 0; k < i; k++) {
                ans.append(S.charAt(k));
            }
            ans.append(l);
            return ans.length() >= S.length() ? S : ans.toString();
        } else if (S.charAt(0) == S.charAt(1)) {//
            for (int j = 1; j < S.length(); ++j) {
                if (ch == S.charAt(j)) {
                    cnt++;
                } else {
                    ans.append(ch);
                    ans.append(cnt);
                    ch = S.charAt(j);
                    cnt = 1;
                }
            }
            ans.append(ch);
            ans.append(cnt);
            return ans.length() >= S.length() ? S : ans.toString();
        }
        return "0";
    }
}
