import java.util.*;
class pro{
    static boolean prof(String str1,String str2){
    if (str1.contains(str2)){
        String result = str1.replace(str2, "****");
        System.out.print("Now the New String is:  "+ result);
        return true;
    }         
    else{
        System.out.print("There is no any profanity in this Statement ");
        return false;
    }
    }      
}
class Profanity{
    public static void main(String[]a){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your Statement: ");
        String s1=sc.nextLine();
        System.out.print("Enter the Bad Word: ");
        String s2=sc.nextLine();
        boolean found=pro.prof(s1,s2);

    }
}

