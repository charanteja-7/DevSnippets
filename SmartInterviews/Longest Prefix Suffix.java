//Longest Prefix Suffix
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String str = sc.next();
        char[] carr= str.toCharArray();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            str1.append(carr[i]);
            str2.insert(0,carr[str.length()-i-1]);
            if(str1.toString().equals(str2.toString()) && str1.length() != str.length()){
                int size = str1.length();
                if(max < size){
                    max = size;
                }
            }
        }
        System.out.println(max);
    }
}
