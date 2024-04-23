import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n;i++){
            nums[i]=sc.nextInt();
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int t =sc.nextInt();
        while(t-- > 0){
            int num = sc.nextInt();
            System.out.println(map.get(num)==null?0:map.get(num));
        }
    }
}
