import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i< n;i++){
                a[i] = sc.nextInt();
            }
            if(subsetSum(n,a,k) == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        } 
    }
      public static boolean subsetSum(int n, int[] a, int k) {
        boolean[] dp = new boolean[k + 1];
        dp[0] = true;
        for (int num : a) {
            for (int i = k; i >= num; i--) {
                dp[i] |= dp[i - num];
            }
        }
        return dp[k];
    }
}
