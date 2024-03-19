//here I am just printing the result but as per the problem statement this logic is wrong.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=1;
        while(t > 0){
            System.out.println("Test Case #"+i+++":");
        int n = sc.nextInt();
        rotateMatrix(sc,n);
        t--;
        }
    }
    public static void rotateMatrix(Scanner sc ,int n){
        int[][] a = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j =0; j< n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            for(int j =n-1; j>=0;j--){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
