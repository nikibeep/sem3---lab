import java.io.IOException;
import java.util.*;
class Arrayclass{
    public Arrayclass(){
        //default constructor
    }
    public void readArray(int[] arr){
        //read array
        System.out.println("Enter 10 numbers:");
        try (Scanner scan = new Scanner(System.in)) {
            for(int i=0; i<arr.length; i++){
                arr[i] = scan.nextInt();
            }
        }
    }
    public int highestNumber(int[] arr){
        //find highest
        int high = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>high){
                high = arr[i];
            }
        }
        return high;
    }
    public int smallestNumber(int[] arr)throws InputMismatchException{
        //find smallest
        int small = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        return small;
    }
    public int isRepeat(int[] arr){
        //find repeat
        int repeat = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    repeat = arr[i];
                }
            }
        }
        return repeat;
    }
    public int repeatedElementCount(int[] arr){
        //find repeated element count
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public void showRepeatedNumbers(){
        //show repeated numbers
        int[] arr = new int[10];
        readArray(arr);
        int count = repeatedElementCount(arr);
        int[] repeat = new int[count];
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    repeat[k] = arr[i];
                    k++;
                }
            }
        }
        System.out.println("Repeated numbers are:");
        for(int i=0; i<repeat.length; i++){
            System.out.print(repeat[i]+" ");
        }
    }
}
public class MyArray {
    public static void main(String[] args){
        Arrayclass obj = new Arrayclass();
        int[] arr = new int[10];
        obj.readArray(arr);
        System.out.println("Highest number is:"+obj.highestNumber(arr));
        System.out.println("Smallest number is:"+obj.smallestNumber(arr));
        System.out.println("Repeated number is:"+obj.isRepeat(arr));
        System.out.println("Repeated number count is:"+obj.repeatedElementCount(arr));
        obj.showRepeatedNumbers();
    }  
}
