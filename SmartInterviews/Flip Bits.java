import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        int res = a^b;
        while(res!=0){
            count++;
            res = res&(res-1);
        }

        System.out.println(count);
        t--;
        }
    }
}
