import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int testcase= 1;
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println("Test Case #"+testcase+++":");
            String str = "";
            balancedParentheses(2*n,str,0,0,0);
        } 
    }
    public static void balancedParentheses(int n,String str,int o,int c,int ind){
        if(ind == n){
             System.out.println(str);
            return;
        }
        if(o<n/2){
            balancedParentheses(n,str+'{',o+1,c,ind+1);
        }
        if(c<o){
            balancedParentheses(n,str+'}',o,c+1,ind+1); 
        }
    }
}
