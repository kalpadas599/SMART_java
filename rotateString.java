import java.util.*;
class rotateString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two string to check: ");
        String s1 = sc.nextLine();
        String s2  = sc.nextLine();
        String s3 = s1+s1;
        if(s3.contains(s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}