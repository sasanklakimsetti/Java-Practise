// Check whether the string is a good string or not
// Good String: atmost one character in the string is occuring odd number of times.
// testcase: aba -> true
// testcase : abbccccddda -> true
// testcase : aaabbb -> false

import java.util.*;

public class GoodString {
    //bruteforce approach
    // tc: O(N^2)
    // sc: O(1)
    static boolean checkGood1(String str){
        int oddCount=0;
        for(int i=0;i<str.length();i++){
            int count=0;  // for each letter
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) count++;
            }
            if((count%2)!=0) oddCount++;
        }
        return oddCount==1;
    }
    // approach 2
    // time : O(N^2)
    // extra space for lists, maps
    static boolean checkGood2(String str){
        boolean yes=false;
        HashSet<Character> set1=new HashSet<>();
        if(str.length()>0){
            for(Character ch : str.toCharArray()){
                set1.add(ch);
            }
            List<Character> list1=new ArrayList<>(set1);
            Map<Character, Integer> map1=new HashMap<>();
            for(int i=0;i< list1.size();i++){
                int count=0;
                for(int j=0;j<str.toCharArray().length;j++){
                    if(list1.get(i)==str.charAt(j)){
                        count++;
                    }
                }
                map1.put(list1.get(i),count);
            }
            int count=0;
            List<Integer> list2=new ArrayList<>(map1.values());
            for(int i=0;i<list2.size();i++){
                if(list2.get(i)%2!=0) count++;
            }
            if(count!=1) yes=false;
            else yes=true;
        }
        else yes=false;
        return yes;
    }
    // approach 3
    // time: O(N)
    // space : O(26)
    static boolean checkGood3(String str){
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            int ind=str.charAt(i) - 'a';  // subtracting the ascii value of the char at index with ascii value of 'a'
            // a:0 to z:25
            arr[ind]++;  // incrementing the frequency of charcater
            // ex: aabbc
            // when the ind is calculated for a, the ind will be 0 coz both ascii values will be same
            // then we use that index and increment the frequency at that index in arr
            // the a's frequency will be incremented two times, same with b and c's will be once.
        }
        int odd=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0&&(arr[i]&1)==1) odd++;
        }
        return odd==1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: "); String str=sc.next();

        System.out.println("Using bruteforce approach: "+checkGood1(str));
        System.out.println("Using approach 2: "+checkGood2(str));
        System.out.println("Using approach 3: "+checkGood3(str));
    }
}