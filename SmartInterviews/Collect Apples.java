import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = parse(br.readLine());
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n= parse(st.nextToken());
            int m = parse(st.nextToken());
            int mat[][] = new int[n][m];
            for(int i = 0; i< n;i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0;j < m;j++){
                    mat[i][j] = parse(st.nextToken());
                }
            }
            System.out.println(collect(mat,n,m));
        }
    }
    public static int collect(int[][] mat , int n , int m){
        int[][]dp = new int[n+1][m+1];
         for(int i = 0;i <=n;i++){
             dp[i][0]  =0;
         }
         for(int i =0;i <=m;i++){
             dp[0][i] = 0;
         }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j])+mat[i-1][j-1];
            }
        }
        
        return dp[n][m];
    }
    public static int parse(String str){
        return Integer.parseInt(str);
    }
}
