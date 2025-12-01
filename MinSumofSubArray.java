import java.util.*;
public class MinSumofSubArray{
    public static void sum(int numbers[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=numbers[k];
                }
                System.out.println(sum);

                if(sum<min){
                    min=sum;
                }
            }
        }
        System.out.println("Minimum sum of subaaray:"+min);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        sum(numbers);
    }
}