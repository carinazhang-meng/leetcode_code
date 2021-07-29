package Face_exercise.MaxAppear_07_23_01;

import java.util.HashMap;

/**
 * @Author Zhangmengyan
 * @Date 23/07/2021
 * 找出整形数组出现次数最多的第一个数字
 **/
public class MaxAppear {
    public static void main(String[] args) {
        int[] num = {3, 3, 4, 4, 1};
        System.out.println(Maxk(num));
    }

    public static int Maxk(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE, res = 0;

        for (int i = 0; i < num.length; i++) {
            int n = map.get(num[i]);
            if (n > max) {
                max = n;
                res = i;
            }
        }
        return res;
    }

}
/*
用哈希表完成
1.遍历整个数组将num[i]和其出现的次数找出来，使用方法getOrderDefault(num[i],0)+1
2.设置边界最大值。
3.再次遍历一次数组，获得num[i]的次数，如果比最大值要大，就给max，否则继续遍历
 */
