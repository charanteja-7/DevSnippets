import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str1 = sc.nextLine();
            String[] s = str1.split(" ");
            for(int i = s.length-1; i>=0;i--){
                System.out.print(s[i]+" ");
            }
            System.out.println();
        }
    }
   
}
