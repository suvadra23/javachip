import java.util.*;
class Sumofno {
    public static void main(String[] args) {
        int x, t, n ;
        t = 0;
        System.out.println("1^x + 2^x + 3^x + ... + n^x");
        System.out.println("Enter the x value : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter the n value : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            t = t + (int) Math.pow(i, x) ;
        }
        System.out.println("The sum is : " + t);
    }
}