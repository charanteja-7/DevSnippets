import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Node {
    int val;
    Node left;
    Node right;

    Node(int data) {
        this.val = data;
        this.left = this.right = null;
    }
}

public class Main {
    static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Node root = null;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                root = createBST(root, val);
            }

            ans = Integer.MIN_VALUE;
            findDiameter(root);
            pw.println(ans);
        }

        pw.close();
    }

    public static Node createBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = createBST(root.left, val);
        } else {
            root.right = createBST(root.right, val);
        }

        return root;
    }

    public static int findDiameter(Node root) {
        if (root == null) return 0;

        int lh = findDiameter(root.left);
        int rh = findDiameter(root.right);
        ans = Math.max(ans, 1 + lh + rh);

        return 1 + Math.max(lh, rh);
    }
}
