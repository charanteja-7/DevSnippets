import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i< n;i++){
                nums[i] =sc.nextInt();
            }
            frequencySort(nums,n);
        }
    }
    public static void frequencySort(int[] nums,int n){
        //store the count of each element
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //sort based on count , if equal then check the values and sort
        Comparator<Integer> c = new Comparator<Integer>(){
            public int compare(Integer n1,Integer n2){
                int fcompare = map.get(n1).compareTo(map.get(n2));
                if(fcompare != 0){
                    return fcompare;
                }else{
                    return n1.compareTo(n2);
                }
            }
        };
        //storing array elements in list to sort 
        List<Integer> numList = new ArrayList<>();
        for(int num:nums){
            numList.add(num);
        }
        //sort the list based on the custome comparator
        Collections.sort(numList,c);
        //print the list or convert the list back to array and return 
        for(int i = 0; i < n;i++){
            System.out.print(numList.get(i)+" ");
        }
        System.out.println();
    }
}
