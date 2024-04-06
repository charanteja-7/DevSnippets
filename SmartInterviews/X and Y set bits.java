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
            System.out.println(setBit(a,b));
        }
    }
   static long setBit(int a , int b){
        int M = (int)1e9 + 7;
        if(a==b){
            return power(2,a)%M;
        }else{
            return (power(2,a)+power(2,b))%M;
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
