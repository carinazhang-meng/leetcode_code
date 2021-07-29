package Face_exercise.Lru_07_23_02;

import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * @Author Zhangmengyan
 * @Date 23/07/2021
 **/
public class LRu {
    public static void main(String[] args) {
        int[][] operators = {{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int k = 3;
        int[] res = LRU(operators, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] LRU(int[][] operators, int k) {
        // write code here
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int[] operator : operators) {
            int key = operator[1];
            switch (operator[0]) {
                case 1:
                    int value = operator[2];
                    if (map.size() < k) {
                        map.put(key, value);
                    } else {
                        Iterator it = map.keySet().iterator();
                        map.remove(it.next());
                        map.put(key, value);
                    }
                    break;
                case 2:
                    if (map.containsKey(key)) {
                        int val = map.get(key);
                        list.add(val);
                        map.remove(key);
                        map.put(key, val);
                    } else {
                        list.add(-1);
                    }
                    break;
                default:
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int val : list) {
            res[i++] = val;
        }
        return res;
    }
}
/*
页面置换算法：将最近未使用过的页面进行淘汰。opt=1,表示将(key,value)插入该结构，opt=2,返回key对应的value值，如果没有，返回-1
1.构建一个hashmap。
2.插入key的时候，先判断大小，如果大小小于k,直接插入；否则，应用keySet的iterator函数对其进行排序，将排在最末尾的删除，并put新的
3.查找value的时候，使用.containsKey()函数判断是否包含这个，如果包含的话就用get获得，之后输出的链表，add添加，并删掉key，添加新的。
也就是从头部插入。
4.最后将list结果输出
 */
