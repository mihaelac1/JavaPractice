package JavaPracticeGitHub.Algorithms;

public class MaxProfit121 {
    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int end = prices.length;
        for(int i = 0; i < end; i ++){
            int j = end - 1;
            while(j > i){
                if(prices[j] - prices[i] > maxProfit )
                    maxProfit = prices[j] - prices[i];
                j--;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

}
