import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long count = 0;
            while(n>=5L){
                count+=n/5L;
                n/=5L;
            }
            System.out.println(count);
        }
    }
}
