import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
        }
    }
     static long power(int a, int n){
        long ans = 1;
        int M = (int)1e9 + 7;
        long x = a;
        while(n!=0){
            if((n&1)==1){
                ans = (ans*x)%M;
            }
            x =(x*x)%M;
            n = n>>1;
        }
        return ans;
    }
}
