import java.io.*;
import java.util.*;

public class Main {
    static long[][] multiply(long[][] mat1,long[][] mat2){
        long[][] res = new long[2][2];
        Arrays.fill(res[0],0);
        Arrays.fill(res[1],0);
        int M = (int)1e9+7;
        for(int i = 0; i< 2;i++){
            for(int j = 0; j < 2;j++){
                for(int k = 0; k<2;k++){
                    res[i][j] += mat1[i][k]*mat2[k][j]%M;
                }
            }
        }
        return res;
    }
    static long[][] fun(long[][] a,long n){
        if(n<=1){
            return a;
        }
        long[][] temp = fun(a,n/2);
        if(n%2 == 0){
            return multiply(temp,temp);
        }
        return multiply(temp,multiply(temp,a));
    }
   static long solve(long n ){
       int M = (int)1e9+7;
       long[][] a = {{1,1},{1,0}};
       long[][] ans = fun(a,n);
       return ans[0][0]%M;
   }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            System.out.println(solve(n));
            t--;
        }
    }
}
