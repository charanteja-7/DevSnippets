import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i = 0; i < n;i++){
                for(int j = 0;j < n;j++){
                    a[i][j] =sc.nextInt();
                }
            }
           int[] diagonalSum = CalculateSum(a,n);
           for(int i = 0; i < diagonalSum.length;i++){
               System.out.print(diagonalSum[i]+" ");
           }
           System.out.println();
        }
    }
    public static int[] CalculateSum(int[][] a , int n){
        int[] sums = new int[2*n-1];
        for(int i = 0; i < sums.length;i++){
              sums[i] = 0;
        }
        for(int i = 0; i < n;i++){
                for(int j = 0;j < n;j++){
                    sums[n-j-1+i] += a[i][j];
                }
        }
        return sums;
    }

}
