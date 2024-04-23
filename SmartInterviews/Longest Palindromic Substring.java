import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(maxPalindrom(str,n));
        }
    }
    public static int maxPalindrom(String str , int n ){
        int ans = Integer.MIN_VALUE;
        for(int i =0 ; i < n-1;i++){
            int p1=i,p2=i;
            while(p1>=0 && p2<n && str.charAt(p1) == str.charAt(p2)){
                p1--;
                p2++;
            }
            ans = Math.max(ans,p2-p1-1);
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<n && str.charAt(p1) == str.charAt(p2)){
                p1--;
                p2++;
            }
            ans = Math.max(ans,p2-p1-1);
        }
        return ans;
    }
}
