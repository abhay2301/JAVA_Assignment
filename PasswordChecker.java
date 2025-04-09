import java.util.*;

class Password{
    int checker(String str,int n){
        if(n<4){
            return 0;
        }
        if (Character.isDigit(str.charAt(0))) {
                return 0; 
            }

        int digit=0, upper=0;
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            if(ch==' '|| ch=='/'){
                return 0;
            }
            
            if(Character.isDigit(ch)){
                digit++;
            }
            if(Character.isUpperCase(ch)){
                upper++;
            }
        }
        if(digit == 0)return 1;
        if(upper == 0)return 1;
        return 2;
    }
}
class PasswordChecker{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        String str1=sc.nextLine();
        int m=str1.length();
        // System.out.print(checker(str1,str1.length()));
        Password ob=new Password();
        int result=ob.checker(str1,m);
        if (result == 0){
            System.out.println("Invalid Password");
        }
        else if (result == 1){
            System.out.println("Password must contain at least one digit");
        }
        else{
            System.out.println("Valid Password");
        }
    }
}


