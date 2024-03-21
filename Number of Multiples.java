import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count =0;
        count = (((n/3L) + (n/5L))- (n/(3L*5L)));
         System.out.println(count);
    }
}
