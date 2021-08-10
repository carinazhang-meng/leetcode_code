package jishiti.rongyao.URL_08_10_02;

import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 10/08/2021
 **/
public class StringURL {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str = str.replace(","," ");
//        String[] str1 = str.split(" ");
//        String a = str1[0];
//        String b = str1[1];
        String a = "/";
        String b = "/";
        a = remove(a);
        b = remove(b);
        System.out.println('a' + a + 'b' + b);
        if (a.equals("") && b.equals("")) System.out.println("/");
        else if (a.equals("") && !b.equals("")) System.out.println("/" + b);
        else if (!a.equals("") && b.equals("")) System.out.println("/" + a);
        else {
            System.out.println("/" + a + "/" + b);
        }
    }

    public static String remove(String s) {
        if (s.length() == 0) return "";
        StringBuffer sb = new StringBuffer(s);
        //System.out.println(sb);
        //首先去掉a和b中的/
        if (sb.charAt(0) == '/') {
            sb.replace(0, 1, "");
        }
        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '/') {
            sb.replace(sb.length() - 1, sb.length(), "");
        }
        return sb.toString();
    }

}
