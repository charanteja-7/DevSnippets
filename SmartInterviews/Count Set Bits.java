import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        long n = sc.nextLong();
        long count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        System.out.println(count);
        t--;
        }
    }
}
