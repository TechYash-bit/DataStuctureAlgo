import java.util.*;
public class binarySearch {
    public static void input(int arr[]){
       
    }
    static int binary(int[] arr,int target){
        int lower=0,upper=arr.length-1;
        while(upper>=lower){int mid=upper-(upper-lower)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target){
                lower=mid+1;
            }    
            else
            upper=mid-1;}
            return -1;
        
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
   
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element in array");
        int target=sc.nextInt();
        //input(arr);
       int index= binary(arr, target);
       System.out.println(index);

        
    }
    
}
