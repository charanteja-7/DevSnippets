import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger n = sc.nextBigInteger();
            BigInteger p = sc.nextBigInteger();
            System.out.println(n.mod(p));
        }

    }
}
