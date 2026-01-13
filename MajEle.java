import java.util.*;
public class maxProfit {

    public static void MaxEle(int[] prices) {
        int key=0;int count=0;
        for(int n:prices){
            if(count==0){
                key=n;
            }
            if(n==key){
                count++;
            }
            else{
                count--;
            }
        } 
        System.err.println(key);
    }
   
    public static void main(String[] args) {
       int prices[]={1,1,2,2,3,2,1,1};
       MaxEle(prices);
      
    }

}