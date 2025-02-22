import java.util.*;
class linearSearch{
    public static int linear(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
            System.out.println("enter the element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element we have to find");
        int target=sc.nextInt();

        int index=linear(arr,target);
        System.out.println(index
        );
        
    }
}