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
            int[] nums = new int[n+1];
            Node root = null;
            for(int i =1; i <= n;i++){
                nums[i] = sc.nextInt();
            }
            root = insert(nums,1,n);
            System.out.println(checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)?"True":"False");
        }
    }
    public static Node insert(int[] nums , int i , int n){
        if(i > n || nums[i] == 0){
            return null;
        }
        Node root = new Node(nums[i]);
        root.left = insert(nums,2*i,n);
        root.right = insert(nums,2*i+1,n);
        return root;
    }
    public static boolean checkBST(Node root,int min,int max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return checkBST(root.left,min,root.val) && checkBST(root.right,root.val,max);
    }  
    
}
