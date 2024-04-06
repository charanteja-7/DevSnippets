import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = 0;
            int[] a = new int[n];
            for(int i = 0; i< n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i< n-1;i++){
                for(int j =0;j<n-i-1;j++){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j] =a[j+1];
                        a[j+1] = temp;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
