import java.util.*;
class unique{
    static boolean word(String str){
        str=str.toLowerCase();
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}



class UniqueCharacter{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Word: ");
        String text=sc.nextLine();
        boolean found=unique.word(text);
        if(found){
            System.out.println("This is Unique Word");
        }
        else{
            System.out.println("This is not Unique Word");
        }
    }
}