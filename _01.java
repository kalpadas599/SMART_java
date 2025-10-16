

import java.util.Scanner;
class _01{
    public static void main(String [] args){
        /* for(int i = 0; i<10; i++){
            System.out.println("2 x " + (i+1) + " = " + 2 * (i+1));
        } */
       //factorial of a number
       //int fact = 1;
       Scanner sc =  new Scanner(System.in);
       System.out.println("enter a num: ");
       int n = sc.nextInt();
       /*for(int i=1; i<=n; i++){
        fact = fact * i;
        //System.out.println(fact);
       }
       System.out.println("factorial result: "+fact); */

       /* //fibonacci series
       int n1=1, n2=1,n3;
        System.out.print(n1+"\t"+ n2);
       for(int i=1; i<=n-2; i++){
        n3 = n1+n2;
        n1=n2;
        n2=n3;
        System.out.print("\t"+n3);
       } */
      /* //counting digits in a number
      int c = 0;
      while(n>0){
        n = n/10;
        c++;
      }
      System.out.print("count is: "+c); */
      
      /* //reverse of a number
      int rev = 0;
      while(n>0){
        int ans = n%10;
        rev = rev*10+ans;
        n=n/10;
      }
      System.out.print("reverse of a num is : "+ rev); */
      //sum of even and odd within a range
      int evenSum = 0;
      int oddSum = 0;
      for(int i=1; i<=n; i++){
        if(i%2==0){
            evenSum = evenSum + i;
        }
        else{
            oddSum = oddSum + i;
        }  
      }
        System.out.println("even sum is:"+evenSum);
        System.out.println("odd sum is:"+oddSum);
    }
}