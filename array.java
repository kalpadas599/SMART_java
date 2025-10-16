
import java.util.Arrays;
import java.util.Scanner;

class array {
    //write a prog to compute the sum of array elements

    static void printarr(int arr[]) {
        System.out.println("elems you enterd: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            sum += arr[i];
        }
        System.out.println("\nQ01. The sum is: " + sum);
    }

    static void greater(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Q02. The max is: " + max);
    }

    static void removeDuplicate(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        System.out.println("Q03. Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printarr(arr);
        greater(arr);
        Arrays.sort(arr);
        removeDuplicate(arr, n);

        
        System.out.print("Enter a string: ");
        sc.nextLine(); // important!
        String str = sc.nextLine();

        System.out.print("Enter a character to remove: ");
        char toRemove = sc.next().charAt(0); 

        removeOccurance(str, toRemove);

    }

    static void removeOccurance(String str, char toRemove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != toRemove) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Q04. String after removing '" + toRemove + "' is: " + sb.toString());

    }
}
