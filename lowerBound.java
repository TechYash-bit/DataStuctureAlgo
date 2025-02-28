import java.util.*;
public class lowerBound {

    static void takeInput(int arr[]){
        System.out.println("enter the eelement in array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    static int lowBound(int arr[],int n,int tar){
        int ans=-1;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]>=tar){
                ans=mid;
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return ans;
    }

    public static void main(String args[]){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        takeInput(arr);
        System.out.println("enter the target element");
        int tar=sc.nextInt();
       int index=lowBound(arr, size, tar);

       System.out.println(index);
    }
    
}
