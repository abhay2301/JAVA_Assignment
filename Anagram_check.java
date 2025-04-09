import java.util.*;

class checker{
    static boolean isanagram(String str1, String str2){
        str1=str1.replaceAll("\\s", "").toLowerCase();// this is remove all spaces
        str2=str2.replaceAll("\\s", "").toLowerCase();
        if(str1.length() != str2.length()){
            return false;

        } 
        char [] s1=str1.toCharArray();  // to convert string into a character Array
        char [] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);

    }
}
class Anagram_check{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String text=sc.next();
        System.out.print("Enter the Second String: ");
        String text1=sc.next();
        checker ob =new checker();
        ob.isanagram(text, text1);
        if (ob.isanagram(text, text1)){
            System.out.print("This is Anagram");
        }
        else{
            System.out.print("this is not Anagram");
            }
    }

}