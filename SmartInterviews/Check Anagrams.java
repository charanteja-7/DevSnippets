import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str1 = sc.next();
            String str2 = sc.next();
            if(anagram(str1.toCharArray(),str2.toCharArray()))
                System.out.println("True");
            else
                System.out.println("False");  
        }
    }
    public static boolean anagram(char[] str1,char[] str2){
        if(str1.length != str2.length)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i = 0 ; i<str1.length ;i++){
            if(str1[i]!= str2[i])
                return false;
        }
        return true;
    }
}
