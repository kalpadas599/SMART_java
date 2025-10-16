public class _04 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i+=3)
        {
            tab(i,i+1,i+2);
            System.out.print("\n");
        }
    }
    public static void check(int n)
    {
        if(n%2==0)
        System.out.println(n+" is even");
        else
        System.out.println(n+" is odd");
    }
    public static void tab(int i,int j,int k){
        check(i);
        check(j);
        check(k);
        System.out.println();
        if(k==21){
           for(int y=1;y<=10;y++)
        {
            System.out.println(i+" x "+y+" = "+(y*i)+"\t\t"+j+" x "+y+" = "+(y*j));
        } 
        }
        else{
        for(int y=1;y<=10;y++)
        {
            System.out.println(i+" x "+y+" = "+(y*i)+"\t\t"+j+" x "+y+" = "+(y*j)+"\t\t"+k+" x "+y+" = "+(y*k));
        }
    }
    }
}
