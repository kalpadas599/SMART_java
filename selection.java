import java.util.Scanner;

class selection{
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
        //selection sort
      for( int i=0;i<arr.length;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
             if(arr[j]>arr[min]){
                min=j;
             }
             int temp=arr[j];
             arr[j]=arr[min];
             arr[min]=temp;
        }
      }
         System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}