import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =1;i<=t;i++){
            System.out.println("Test Case #"+i+":");
            String str = sc.next();
            List<String> res = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            boolean freq[] = new boolean[str.length()];
            generatePermutations(str,res,sb,freq);
            //sort the res list
            Collections.sort(res);
            //print the res list;
            for(String s : res){
                System.out.println(s);
            }
        }
    }
    public static void generatePermutations(String str,List<String> res,StringBuilder sb,boolean[] freq ){
        if(sb.length() == str.length()){
            res.add(sb.toString());
            return;
        }
        for(int i =0; i< str.length();i++){
            if(!freq[i]){
                freq[i] = true;
                sb.append(str.charAt(i));
                generatePermutations(str,res,sb,freq);
                sb.deleteCharAt(sb.length()-1);
                freq[i] = false;
            }
        }
    }
}
