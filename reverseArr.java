import java.util.*;
class reverseArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        System.out.println("enter elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        //reverse arr
        int[] newarr = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>= 0; i--){
            newarr[j] = arr[i];
            j++;
        }
        for(int i=0; i<newarr.length; i++){
            System.out.print(" "+newarr[i]);
        }

    }
}