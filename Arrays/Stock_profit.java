public class Stock_profit {
    public static void buy_Sell_Stock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;       // today profit // prices = selling price
                maxPrfit = Math.max(maxPrfit, profit);   
            }else{
                buyPrice = prices[i];    // minimum 
            }
        }
        System.out.println("prifit is = " + maxPrfit);
    }
    
    public static void main(String[]args){
        int pricees[] = {7,1,5,3,6,4};
        buy_Sell_Stock(pricees);
    }
}
