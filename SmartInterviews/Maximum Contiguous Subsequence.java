import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i = 0;i < n;i++){
                nums[i] = sc.nextInt();
                queue.add(nums[i]);
            }
            int prev = queue.poll(),count = 1, max = 1;
            while(!queue.isEmpty()){
                int val = queue.poll();
                if(prev+1 == val){
                    count++;
                }else if(val == prev){}
                else{
                    count= 1;
                }
                    prev = val;
                    max = Math.max(max,count);
            }
            max = Math.max(max, count);
            System.out.println(max);
        }
    }
}
