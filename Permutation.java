import java.util.*;

class allPermutation{
    void permut (String str, String str1){
        if(str.isEmpty()){
            System.out.println(str1);
            return;
        
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String Remaining=str.substring(0,i) + str.substring(i+1);
            permut(Remaining, str1+ch);
            
        }
    }
}
class Permutation{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String text=sc.nextLine();
        
        allPermutation ob = new allPermutation();
        ob.permut(text,"");
    }
}