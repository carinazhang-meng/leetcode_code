package Face_exercise.Match_07_31_02;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author Zhangmengyan
 * @Date 31/07/2021
 **/
public class Match {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str = str.replace(" ", "");
//        int[] arr = new int[str.length()];
//        for (int i =0;i <str.length();i++){
//            arr[i] = str.charAt(i) - '0';
//        }
//        System.out.println();
//        //String s = "[]5[[]2]3";
//
////        int result = sum(s);
////
////        System.out.println(result);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int sum = 1, inner = 0;
        LinkedList<Character> list = new LinkedList<>();
        int point = 0;
        while (point < s.length()) {
            if (s.charAt(point) == '[') {
                list.addLast('[');
                sum = 1;
                inner = 0;
                point++;
            } else if (s.charAt(point) == ']') {
                while (!list.isEmpty()) {
                    Character last = list.removeLast();
                    if (last == '[') break;
                    else {
                        inner += last - '0';
                    }
                }
                point++;
                // 说明最后末尾是 ]，没有数字了
                if (point == s.length()) {
                    sum = inner + 1;
                    list.addLast((char) (sum + '0'));
                    break;
                }
                // 说明最后是  ]数字 的情况
                if (Character.isDigit(s.charAt(point))) {
                    int a = s.charAt(point) - '0';
                    sum = inner * a + a;
                    point++;
                }
                list.addLast((char) (sum + '0'));
                sum = 1;
                inner = 0;
            }
        }
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i) - '0';
        }
        System.out.println(res);
    }
//        static int sum(String string){
//            if(string.length() == 0) {
//                return 0;
//            }
//            int result = 0;
//            Stack<Character> stack = new Stack<>();//栈
//            char c;
//            for (int i = 0; i < string.length(); i++) {
//                c = string.charAt(i);
//                if(Character.isDigit(string.charAt(i))){
//                    //如果是数字 跳出当前循环
//                    continue;
//                }
//                if (c == '[') {  // 左括号进栈
//                    stack.push(c);
//                }
//                if (c == ']') {
//                    try {
//                        if(Character.isDigit(string.charAt(i+1))){
//                            //右括号下一个字符如果是数字
//                            int size = stack.size() - 1;
//                            int num = Character.getNumericValue(string.charAt(i+1));
//                            result += size + num;
//                            stack.pop();
//                            stack.clear();
//                        }else {
//                            //下一个字符不是数字
//                            int size = stack.size();
//                            result += size ;
//                            stack.pop();
//                            stack.clear();
//                        }
//
//                    }catch (Exception e){
//                        return result;
//                    }
//
//                }
//            }
//            return result;
//        }
}

