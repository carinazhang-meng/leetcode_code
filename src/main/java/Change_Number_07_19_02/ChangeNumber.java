package Change_Number_07_19_02;

/**
 * @Author Zhangmengyan
 * @Date 19/07/2021
 **/
public class ChangeNumber {
    public static void main(String[] args) {
        int[] num = new int[2];
        num[0] = 0;
        num[1] = 2147483647;
        System.out.println(swapNumbers(num));
    }

    public static int[] swapNumbers(int[] numbers) {
        if (numbers == null || numbers.length != 2) {
            return null;
        }
        numbers[0] = numbers[1] ^ numbers[0];
        numbers[1] = numbers[1] ^ numbers[0];
        numbers[0] = numbers[1] ^ numbers[0];
        return numbers;
    }
}
