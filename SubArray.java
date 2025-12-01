import java.util.*;
public class SubArray{
    public static void printSubArray(int numbers[]){
        int total=0; 
        //for starting point
        for (int i=0; i<numbers.length;i++){
            int start=i;
            //for ending point
            for(int j=i; j<numbers.length;j++){
                int end =j;
                //int sum=0;
                //print all elements from start to end
                for(int k=start; k<=end;k++){
                    
                    System.out.print(numbers[k] + " ");
                   // sum+=numbers[k];
                    
                }
               // System.out.println("sum:"+sum);
                System.out.println();
                total++;
                
            }
            System.out.println();
        }
        System.out.println("total subarray:"+total);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSubArray(numbers);
    }
}