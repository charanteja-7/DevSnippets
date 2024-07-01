import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
           st = new StringTokenizer(br.readLine());
           String str = st.nextToken();
           if(str.equals("insert")){
               int num = Integer.parseInt(st.nextToken());
               minHeap.add(num);
           }
           else if(str.equals("getMin")){
               if(!minHeap.isEmpty()){
                    System.out.println(minHeap.peek());
               }else{
                   System.out.println("Empty");
               }
           }
           else if(str.equals("delMin")){
               minHeap.poll();
           }
        }
    }
}
