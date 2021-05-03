package JavaPracticeGitHub.Algorithms;


public class MaxProfit122 {

   // private static int profit(int[] prices){

    //}
    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        while(i < prices.length - 1){
            int j = i + 1;
            if(prices[j] - prices[i] > 0){
                maxProfit += prices[j] - prices[i];
            }
                i++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
