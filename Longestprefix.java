/*Write a function to find the longest common prefix string amongst an array of strings. If there is no common
prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","race","car"]
Output: ""
Explanation: There is no common prefix among the input strings*/

import java.util.*;

class Longestprefix{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String user=sc.nextLine();
        // String s1={"flower","flight","flow"};
        System.out.print("Enter the String you want to Search: ");
        String s2=sc.nextLine();
        int compare=user.indexOf(s2);    // indexOf() is a methed to find the position of string 
        if(compare != -1){
            System.out.print(s2+" It is Found");
        }
        else{
            System.out.print("It is Not Found "+s2);
        }

        
    }
}