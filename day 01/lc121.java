//// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
      int opro = 0 ;
         for(int i = 0 ; i<prices.length ; i++){
            if(prices[i] < min)
                min = prices[i]; 
        
           else if( prices[i] - min > opro)
               opro = prices[i] - min;
        
        
    }         return opro;

} }