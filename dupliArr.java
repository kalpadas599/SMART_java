import java.util.*;
class dupliArr{
    //Remove duplicates
public static void main(String[] args){
    int [] arr={1,2,2,5,5};
    Set<Integer> set = new HashSet<>();
    for(int n : arr){
        set.add(n);
    }
    System.out.println(set); 

    //special fibonacci
    int n = 5;
    System.out.print("0 1");

    for(int i=2;i<n;i++){
        int next = fib(i);
        System.out.print(" "+next);
    }

}
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }
}