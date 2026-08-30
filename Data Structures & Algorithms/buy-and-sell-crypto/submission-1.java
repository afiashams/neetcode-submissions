class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
       /*for( int i=0; i < prices.length; i++ ){
            for( int j=i+1; j< prices.length; j++){ 
                if( (prices[j] - prices[i]) > maxProfit ){
                    maxProfit = prices[j] - prices[i];
                }

            }
        }*/
         int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];

            if (curr - minPrice > maxProfit) {
                maxProfit = curr - minPrice;
            }

            minPrice = Math.min(curr, minPrice);

        }
        

        return maxProfit;
        
    }
}
