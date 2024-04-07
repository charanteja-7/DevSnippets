import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sum= sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i< n;i++){
                nums[i] =sc.nextInt();
            }
            System.out.println(tripletSum(nums,n,sum));
        }
    }
    public static boolean tripletSum(int[] nums,int n, int sum){
        //sort the array
        Arrays.sort(nums);
        //use two pointer approach to solve
        for(int i = 0; i< n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left< right){
                int currentSum = nums[i] + nums[left]+nums[right];
                if(currentSum == sum){
                    return true;
                }
                else if(currentSum > sum){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return false;
    }
}
