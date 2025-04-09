import java.util.*;

class Longest{
    public static String findLongWord(String str){
        String []words=str.split(" ");
        String longword="";
        for(String word:words){
            if(word.length()>longword.length()){
                longword=word;
            }
        }
        System.out.print("Longest Word: "+ longword);
        return longword;
    }
}
class findLongestWord{
    public static void main(String[]a){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your Sentence: ");
        String text=sc.nextLine();
        Longest ob=new Longest();
        ob.findLongWord(text);
    }
}