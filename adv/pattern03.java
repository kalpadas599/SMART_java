//zig zag pattern
import java.util.*;
class pattern03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
                if((i)%2==0){
                    for(int j=1; j<=n; j+=2){
                        System.out.print(j+" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }

            //System.out.println();
        
    }
}