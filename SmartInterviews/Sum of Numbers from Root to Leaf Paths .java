
import java.io.*;
import java.util.*;
import java.math.*;
class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
}
public class Main {
    public static long sum = 0;
    public static int m = (int)1e9+7;
    public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim()); // Number of nodes
            Node root = null;
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int data = Integer.parseInt(st.nextToken());
                root = createBST(root, data);
            }
            
            sum = 0; // Reset sum for each test case
            findsum(root,""); // Calculate the sum of all numbers formed from paths
            
            System.out.println(sum);
            
        }
    }
        public static Node createBST(Node root,int val){
            if(root == null){
                return new Node(val);
            }
            if(val < root.val){
               root.left =  createBST(root.left,val);
            }else{
                root.right = createBST(root.right,val);
            } 
            return root;  
        }
       
        public static void findsum(Node root ,String csum ){
            if(root == null) return ;
            csum += String.valueOf(root.val);
            if(root.left == null && root.right == null){
                BigInteger bnum = new BigInteger(csum);//use biginteger to make  sure to store the long strings
                BigInteger M = BigInteger.valueOf(m);// also store the biginteger val of mod
                sum = (sum + bnum.mod(M).intValue()) % m; // calculate the mod value of biginteger and convert it into integer and then add the sum , and then perform the mod again
            }
            findsum(root.left,csum);
            findsum(root.right,csum);
        }
        
}
