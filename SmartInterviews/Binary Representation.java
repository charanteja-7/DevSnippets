import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        int n = sc.nextInt();
        String res = Integer.toBinaryString(n);
        System.out.println(res);
        t--;
        }
    }
}
