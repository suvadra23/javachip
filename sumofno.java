import java.util.*;
class Sumofno {
    public static void main(String[] args) {
        int x,t,d,n;
        t=0;
        System.out.println("x+x^2+x^3+x^4+.....+x^n");
        System.out.println("Enter the x value : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter the n value : ");
        n=sc.nextInt();
        d=x;
        for (int i=1 ; i <= n; i++) {
            t = t+ d;
            // System.out.println("D value "+d);
            // System.out.println("T value "+t);
            d = x * d; 
        }
        System.out.println("The sum is : "+t);
    }
}