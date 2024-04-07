import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k= sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i< n;i++){
                nums[i] =sc.nextInt();
            }
            System.out.println(pairWithDiff(nums,n,k));
        }
    }
    public static boolean pairWithDiff(int[] nums,int n, int k){
       Map<Integer,Integer> map =  new HashMap<>();
       for(int num: nums){
           map.put(num,map.getOrDefault(num,0)+1);
       }
       for(int num : nums){
           int target = num-k;
           if(target != num && map.containsKey(target)){
               return true;
           }
       }
        return false;
    }
}
