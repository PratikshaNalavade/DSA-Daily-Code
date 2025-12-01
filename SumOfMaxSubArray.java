import java.util.*;
public class MaxSumofSubArray{
    public static void sumOfSubArray(int numbers[]){
         
        int max=Integer.MIN_VALUE;
       
        for(int i=0; i<numbers.length;i++){
            int start=i;
            for(int j=i; j<numbers.length;j++){
                int end=j;
                int sum=0;
                for(int k=start; k<=end;k++){
                    sum+=numbers[k];
                }
               System.out.println("Sum of all subarray:"+sum);
                if(sum>max){
                    max=sum;
                }
                  
            }
           
        }
        System.out.println("Maximum sum of subarray:"+max);
        
       
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        sumOfSubArray(numbers);
    }

}
