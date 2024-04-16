import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i <  n ;i++){
                a[i] =sc.nextInt();
            }
            int ans = solve(a,n,k);
            System.out.println(ans);
        }
    }
    public static int solve(int[] a, int n,int k){
        int l = Arrays.stream(a).max().getAsInt();
        int h = Arrays.stream(a).sum();
        int ans = h;
        while(l <= h){
            int mid = (l+h)/2;
            if(valid(a,n,mid,k)){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    public static boolean valid(int[] a, int n ,int mid , int k){
        int csum = 0,w=0;
        for(int i = 0; i<n;i++){
            if(csum+a[i] >mid){
                csum = 0;
                w++;
            }
            if(w>=k){
                return false;
            }
            csum+=a[i];
        }
        return true;
    }
}
