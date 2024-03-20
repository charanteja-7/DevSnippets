//Compress String
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] carr = str.toCharArray();
        int count =0,i=0;
        for( i = 0; i < str.length();i++)
        {
           count=0;
            for(int j=i;j<str.length();j++){
                if(carr[i] == carr[j]){
                    count++;
                   if(j==str.length()-1){
                      System.out.print(carr[i]+""+count);
                      count =-1; 
                      break;
                      
                   }
                }else{
                    System.out.print(carr[i]+""+count);
                    i = j-1;
                    break;
                }
                
            }
            if(count ==-1){
                    break;
                }
        }
        
    }
}
