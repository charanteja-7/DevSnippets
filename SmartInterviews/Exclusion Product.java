import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            int m = (int)1e9+7;
            for(int i = 0; i < n;i++){
                a[i] = sc.nextLong();
            }
            long[] res = new long[n];
            long left =1;
            for(int i =0;i < n;i++){
                res[i] = left;
                left = (left*a[i])%m;
            }
            long right =1;
            for(int i = n-1;i >= 0;i--){
                res[i]  = (res[i]*right)%m;
                right = (right*a[i])%m;
            }
            for(int i = 0; i < n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}
