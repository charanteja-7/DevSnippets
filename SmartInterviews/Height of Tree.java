import java.util.*;

class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val = data;
            this.left = this.right = null;
        }
}
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Node root = null;
            for(int i =0; i < n;i++){
                int val= sc.nextInt();
                root = createBST(root,val);
            }
            System.out.println(treeHeight(root));
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
        public static int treeHeight(Node root){
            if(root == null){
                return -1;
            }
            int l = treeHeight(root.left);
            int r = treeHeight(root.right);
            return Math.max(l,r)+1; 
        }
        
}
