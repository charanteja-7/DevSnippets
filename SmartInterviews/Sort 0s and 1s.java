import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i< n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i< n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
