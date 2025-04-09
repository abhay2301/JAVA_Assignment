import java.util.regex.*;
import java.util.*;

class Domain{
    public static String getDomain(String url){
        String regex = "(?:https?://)?(?:www\\.)?([^/]+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(url);
        if (matcher.find()){

            return matcher.group(1);

        }
        // System.out.print("Extracted Domain: "+matcher);
        return "Invalid Domain";
    }
}

class DomainExtractor{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Domain: ");
        String url=sc.nextLine();
        // Domain ob = new Domain();
        // ob.getDomain(url);
        String result=Domain.getDomain(url);
        System.out.println("Extracted Domain: "+result);
    }
}