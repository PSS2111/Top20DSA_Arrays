import java.util.*;
public class BestTimeToBuy {

  static void getmaxprofit(int[] prices) {
        // TODO Auto-generated method stub
        int min_number=Integer.MAX_VALUE;
        int max_number=Integer.MIN_VALUE;
        int min_index=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min_number){
                min_number=prices[i];
                min_index=i;
            }
            if(i>min_index){
                if(prices[i]>max_number ){
                     max_number=prices[i];
                }
            }
        }
        System.out.println(max_number-min_number);
    }
    public static void main(String[] args) {
        int prices[]={7,10,1,3,6,9,2};
        getmaxprofit(prices);
    }

    
}
