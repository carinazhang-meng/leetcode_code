package ArrayList.odd_even_sequence_07_13;

/**
 * @Author Zhangmengyan
 * @Date 13/07/2021
 **/
public class ExchangeOrder {
    public static void main(String[] args) {
        int data[] = new int[4];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;
        int[] nums = exchange(data);
        for (int i = 0;i<data.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static int[] exchange(int[] nums){
        int left = 0,right = nums.length-1;
        while(left<right){
            while(left<right && nums[left] % 2 ==1){
                left++;
            }
            while(left < right && nums[right] %2==0){
                right--;
            }
            if (left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return nums;
    }
}

