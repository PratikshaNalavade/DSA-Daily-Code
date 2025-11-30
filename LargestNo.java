import java.util.*;
public class LargestNo{

    public static int largestNumber(int numbers[], int largest, int smallest){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest= numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest Number is="+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={3,5,7,9,4,6};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        System.out.println("The largest numbers is="+largestNumber(numbers, largest, smallest));
}
}