//Prefix Suffix Equity
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String delimeter = sc.next().toLowerCase();
        if(str.endsWith(delimeter) && str.startsWith(delimeter)){
          System.out.println("Yes");
        }
       else{
           System.out.println("No");
       }  
    
    }
}
