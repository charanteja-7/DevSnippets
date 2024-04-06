import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println((1<<n)-1);
           toh(n,'A','C','B');
        } 
    }
    public static void toh(int n,char src,char dest , char temp){
        if(n == 0){
            return;
        }
        toh(n-1,src,temp,dest);
        System.out.println("Move "+n+" from "+src+" to "+dest);
        toh(n-1,temp,dest,src);
    }
}
