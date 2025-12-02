import java.util.*;
public class SelectionSort{
    public static void selectSort(int arr[]){
    for (int i=0; i<arr.length-1;i++){
        int min=i;
        for(int j=i+1; j<arr.length;j++){
            if(arr[min] > arr[j]){
                min=j;
            }
        }
        //swap
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
}
    //print
    public static void printArray(int arr[]){
        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,5,2,7,4};
        selectSort(arr);
        printArray(arr);
    }
}