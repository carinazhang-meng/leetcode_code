package Face_exercise.Extract_XML_08_02_03;

import java.util.Scanner;

/**
 * @Author Zhangmengyan
 * @Date 02/08/2021
 **/
public class ExtractXML {
    public static void main(String[] args) {
        String s = "<people><name>shopee</name></people>";
        String xml = "people.name";
        System.out.println(Method(s, xml));
    }

    public static String Method(String s, String path) {
        if (s == null || s.length() == 0 || path == null || path.length() == 0) {
            return "";
        }
        String[] s1 = s.split("<");//获得的是每个路径前面的内容和>
        String[] p1 = path.split("\\.");//获得路径
        System.out.println(s1);
        System.out.println(p1);
        int i;
        int j;
        for (i = 0; i < p1.length; i++) {
            for (j = 0; j < p1[i].length(); j++) {
                if (p1[i].charAt(j) != s1[i + 1].charAt(j)) return "";//将路径的每一个单词都和XMl语句的每一个单词进行对比，比如，people/name
            }
            if (s1[i + 1].charAt(j) != '>') return "";//判断xml里面最后的一个符号是否为>，如果是则说明此时的正确
        }
        String[] res = s1[i].split(">");
        return res[1];//此时的结果为name shopee.
    }
}
/*
给定一个XML字符串，输入一个路径，输出对应路径的值，不存在则返回空字符串。
例子："<people><name>shopee</name></people>","people.name"
1.先去除掉<符号，之后对路径的内容和XML里面的数据进行对比比较。
2.对每一个单词进行比较，同时判断最后一个符号是否为>.
3.如果是的话返回最终的结果。
 */
