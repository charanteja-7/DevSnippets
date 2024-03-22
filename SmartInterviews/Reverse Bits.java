import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(reverseBits(n));
        }
    }
    static long reverseBits(long n){
        long rev = 0;
        for(int i = 0; i< 32 ; i++){
            rev = rev|(((n>>i)&1)<<(31-i));
        }
        return rev;
    }
}
