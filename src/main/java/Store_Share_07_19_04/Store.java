package Store_Share_07_19_04;

/**
 * @Author Zhangmengyan
 * @Date 19/07/2021
 **/
public class Store {
    public static void main(String[] args) {
        int[] prices = new int[6];
        prices[0] = 7;
        prices[1] = 1;
        prices[2] = 5;
        prices[3] = 3;
        prices[4] = 6;
        prices[5] = 4;
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_price = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            if (prices[i] - min_price > max_price) {
                max_price = prices[i] - min_price;
            }
        }
        return max_price;
    }
}
