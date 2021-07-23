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
