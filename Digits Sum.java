//Digits Sum
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger sum = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;
        while(!n.equals(BigInteger.ZERO)){
            BigInteger[] divmod = n.divideAndRemainder(ten);
            BigInteger rem = divmod[1];
            sum = sum.add(rem);
            n = divmod[0];
        }
         System.out.println(sum);

    }
}
