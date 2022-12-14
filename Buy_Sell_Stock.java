public class Buy_Sell_Stock {
        public static int stocks(int price []){
            int buystock = Integer.MAX_VALUE;
            int maxProfit = 0; 
            for( int i=0; i < price.length ;i++){
                
                if(buystock < price[i]){
                        // Always Profit
                    int profit =  price[i] - buystock ;
                    maxProfit = Math.max(maxProfit, profit);
                }
                else {
                    buystock = price[i];
                }
            }
            return maxProfit;
        }
    public static void main(String[] args) {
       int price []= {7, 6, 4, 3, 1};
       System.out.println(stocks(price));

    }
}
