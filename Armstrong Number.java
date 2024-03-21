import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp  = n;
        long sum = 0;
        while(n>0){
            sum+= Math.pow((n%10),3);
            n = n/10;
        }
        if(temp == sum){
 System.out.print("Yes");
        }else{
             System.out.print("No");
        }
       
           
    }
}
