import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int[] nums = new int[n];
            for(int i =0; i < n;i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(sumofxor(nums,n));
        }
    }
    public static long sumofxor(int[] nums , int n){
        long sum = 0; 
        for(int i = 0 ; i < 32;i++){
            int countOnes = 0;
            for(int j = 0;j < n;j++){
                if((nums[j]&(1<<i))!=0){
                    countOnes++;
                } 
            }
            sum+= (long)countOnes*(n-countOnes)*(1<<i);
        }
        return 2*sum;
    }
}
