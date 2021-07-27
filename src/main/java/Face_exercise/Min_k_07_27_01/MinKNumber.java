package Face_exercise.Min_k_07_27_01;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author Zhangmengyan
 * @Date 27/07/2021
 * 保存堆的大小为K，遍历数组中的数字，遍历的时候判断：
 * （1）如果目前堆的大小小于k，将数字放入
 **/
public class MinKNumber {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int k = 2;
        System.out.println(getLeastNumbers(nums, k));
    }

    //    public static int[] getLastNumbers(int[] arr, int k){
//        if(k == 0|| arr.length == 0){
//            return new int[0];
//        }
//        Queue<Integer> pq = new PriorityQueue<>((v1,v2)->v2-v1);//通过堆排序实现的小顶堆
//        for(int num:arr){
//            if (pq.size() < k){
//                pq.offer(num);
//            }
//            else if(num < pq.peek()){
//                pq.poll();
//                pq.offer(num);
//            }
//        }
//        int[] res = new int[pq.size()];
//        int idx = 0;
//        for(int num:pq){
//            res[idx++] = num;
//        }
//        return res;
//    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) return new int[0];
        return quickStart(arr, 0, arr.length - 1, k - 1);
    }

    public static int[] quickStart(int[] nums, int low, int high, int k) {
        int j = partition(nums, low, high);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        return j > k ? quickStart(nums, low, high - 1, k) : quickStart(nums, low + 1, high, k);
    }

    private static int partition(int[] nums, int low, int high) {
        int v = nums[low];
        int i = low, j = high;
        while (true) {
            while (++i <= high && nums[i] < v) ;
            while (--j >= low && nums[j] > v) ;
            if (i >= j) {
                break;
            }
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        nums[low] = nums[j];//nums[j]里面存的是nums[i]的值
        nums[j] = v;//以j为中心点，比num[j]小的都在j的左边，比它大的都在它的右边
        return j;
    }
}
