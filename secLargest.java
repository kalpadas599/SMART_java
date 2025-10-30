import java.util.*;
class secLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        System.out.println("enter elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest ;
        int secLargest = Integer.MAX_VALUE;
        //sort the array
        for(int i =0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        largest = arr[n-1];
        for(int i = n-2; i>= 0; i--){
            if(arr[i]<largest){
                secLargest = arr[i];
                System.out.println("sec largest = "+secLargest);
                break;
            }
            //if no sec largest
            if(i == 0 && secLargest == Integer.MAX_VALUE){
                System.out.println("-1");
            }
        }
    }
}