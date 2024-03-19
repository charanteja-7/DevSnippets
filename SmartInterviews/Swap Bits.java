import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(swapAdjacentBits(n));
        }
    }
    public static int swapAdjacentBits(int n){
        int res = 0;
        int bit1,bit2;
        for(int i = 0 ; i < 32;i= i+2){
            bit1 = (n>>i)&1;
            bit2 = (n>>(i+1))&1;
            res |= (bit1<<(i+1)) | (bit2<<i);
        }
        return res;
    }
}
