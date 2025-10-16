
import java.util.Scanner;
class _02{
    static void table(int n, int x){
        
        for (int i=1; i<=n; i++){
            for(int j=1; j<=x; j++){
                System.out.println("1x" + j + "=" + j*i);
            }
            //System.out.println("1x" + i + "=" + 1*i +" /n "+ "2x" + i + "=" + 2*i +" /n "+ "3x" + i + "=" + 3*i);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        //1-20 table\
        int x = sc.nextInt();
        table(n,x);
        
    }
}