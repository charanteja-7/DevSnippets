import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int p=1;
            while(t-- > 0){
                int n = sc.nextInt();
                System.out.println("Case #"+p+++":");
                for(int i = 1; i <=n;i++){
                    for(int j = 1;j<=n;j++){
                        if(j <= n-i){
                            System.out.print(" ");
                        }else{
                             System.out.print("*");
                        }
                    }
                     System.out.println();
                }
            }
    }
}
