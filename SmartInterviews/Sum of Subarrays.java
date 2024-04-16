import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
             long[] a = new long[n];
             long[] sum = new long[n];
            for(int i = 0; i < n;i++){
                a[i] =sc.nextLong();
            }
            sum[0] = a[0];
            for(int i = 1; i<n;i++){
                sum[i] = a[i] + sum[i-1];
            }
            int k = sc.nextInt();
            while(k-- > 0){
                int l = sc.nextInt();
                int h = sc.nextInt();
                if(l>0){
                    System.out.println(sum[h]-sum[l-1]);
                }else
                {
                    System.out.println(sum[h]);
                }
                
            }
    }
}
