
import java.util.Scanner;

class bubble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+" ith arr elem: ");
            int element=sc.nextInt();
            arr[i]=element;
        }
        System.out.println("unsorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //bubble sort
         for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}