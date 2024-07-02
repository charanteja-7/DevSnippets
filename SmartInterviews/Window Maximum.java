import java.io.*;
import java.util.*;
class Pair implements Comparable<Pair>{
    int ind;
    int data;
    public Pair(int ind, int data){
        this.ind = ind;
        this.data= data;
    }
    @Override
    public int compareTo(Pair other){
        return Integer.compare(this.data, other.data);
    }
}
public class Main {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n  = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int [] ar = new int[n];
            for(int i = 0; i< n;i++){
                ar[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(windowMax(ar,n,k));
        }
    }
    public static int windowMax(int[] ar, int n,int k ){
        int sum = 0;
        PriorityQueue<Pair> maxHeap  = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < k;i++){
            maxHeap.offer(new Pair(i, ar[i]));
        }
        sum += maxHeap.peek().data;
        for(int i = k; i < n;i++){
            maxHeap.offer(new Pair(i , ar[i]));
            while(!maxHeap.isEmpty() && maxHeap.peek().ind <= i-k){
                maxHeap.poll();
            }
            sum += maxHeap.peek().data;
        }
        return sum;
    }
}
