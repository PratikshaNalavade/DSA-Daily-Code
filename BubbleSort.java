import java.util.*;
public class BubbleSort{
    public static void sortArray(int arr[]){
    
        for(int turn=0; turn<arr.length-1; turn++){
            int swaps=0;
            for(int i=0;i<arr.length-1-turn; i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swaps++; //counts how many swaps happened during that turn
                }
            }
            System.out.println("how many time it swaps:"+swaps);  
        }
    }
    public static void printArray(int arr[]){
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={2,5,1,8,6};
        sortArray(arr);
        printArray(arr);
    }
}