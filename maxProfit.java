import java.util.*;
public class maxProfit {

    public static int MaxEle(int[] prices) {
        int min_value=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<min_value){
                min_value=price;
            }
            else if(price-min_value>maxprofit){
                maxprofit=price-min_value;
            }
        }
        return maxprofit;
        
    }
   
    public static void main(String[] args) {
       int prices[]={1,1,2,2,3,2,1,1};
       int answer=MaxEle(prices);
       System.err.println(answer);
    }

}