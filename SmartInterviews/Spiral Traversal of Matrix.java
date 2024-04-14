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
            printSpriralMatrix(a,n);
            System.out.println();
        }
    }
    public static void printSpriralMatrix(int[][] a, int n){
       int top = 0,bottom = a.length-1;
       int left = 0, right = a[0].length-1;
       int direction = 0; //0:right,1:down,2:left,3:up
       while(left<=right && top <=bottom){
           if(direction== 0){
               for(int i = left; i<=right ;i++){
                   System.out.print(a[left][i]+" ");
               }
               top++;
           }else if(direction ==1){
               for(int i = top; i<=bottom ;i++){
                   System.out.print(a[i][bottom]+" ");
               }
               right--;
           }else if(direction == 2){
               for(int i = right; i>=left;i--){
                   System.out.print(a[bottom][i]+" ");
               }
               bottom--;
           }else if(direction ==3){
               for(int i = bottom; i>=top ;i--){
                   System.out.print(a[i][left]+" ");
               }
               left++;
           }
           direction = (direction+1)%4;
       }
    }
}
