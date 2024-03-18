import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i< n;i++){
           sum+=sc.nextInt();
        }
        System.out.println((n+1)*(n+2)/2 - sum);
        t--;
        }
    }
}
