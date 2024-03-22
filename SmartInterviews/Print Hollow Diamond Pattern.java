import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(t-- > 0){
            System.out.println("Case #"+i+++":");
            int n = sc.nextInt();
            printHallowDiamond(n);
        }
    }
    public static void printHallowDiamond(int n){
        int c=0;
        for(int i = 0 ;i<= n-1;i++){
            for(int j = 0; j<=n-1;j++){
                
                if(j==(n/2-c) || j == (n/2+c)){
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i>=n/2)
            c--;
            else
            c++;
        }
    }
}
