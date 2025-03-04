import java.util.*;
class SelectionSort{

    static void inputArray(int arr[]){
        System.out.println("Enter the element in array");
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    static void outputArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];
        inputArray(arr);
        selection(arr);
        outputArray(arr);

    }
}