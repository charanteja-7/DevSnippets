import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long gcd = findGcd(a,b);
            System.out.println((a*b)/gcd+" "+gcd);
        }
    }
    public static long findGcd(long a , long b){
        if(b == 0)
          return a;
        return findGcd(b,a%b);
    }
}
