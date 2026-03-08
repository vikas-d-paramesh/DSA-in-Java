

public class BuyandSellStocksBetter {
    public static int BuySellStock(int arr[]){
        int buyPrize=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<arr.length;i++){
            if(buyPrize<arr[i]){
                int profit=arr[i]-buyPrize;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrize=arr[i];
            }

        }
        return maxProfit;
    }
            public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};

        System.out.print(BuySellStock(arr));

    }
    
}
