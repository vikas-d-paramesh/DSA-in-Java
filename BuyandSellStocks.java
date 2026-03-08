

public class BuyandSellStocks {
    public static int BuySellStock(int arr[]){
        int n=arr.length;

        int buy=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }
        }
        System.out.println(buy);


        int sell=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>sell){
                sell = arr[i];
            }

        }
        System.out.println(sell);

        int profit=sell-buy;


        if(profit<=0){
            profit=0;
        }

        return profit;

    }

    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        int profit=BuySellStock(arr);

        System.out.print(profit);

    }
    
}
