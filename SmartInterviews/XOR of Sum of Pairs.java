import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(xorOfSum(a));
        }
     }
     public static int xorOfSum(int[] a){
         int res = 0;
         for(int i = 0; i < a.length;i++){
                res = res^(2*a[i]);
            
         }
         return res;
     }
}
