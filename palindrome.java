import java.util.*;
class palindrome{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to check palindrome: ");
        String str = sc.nextLine();
        //String rev = "";
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(str.equals(rev)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}