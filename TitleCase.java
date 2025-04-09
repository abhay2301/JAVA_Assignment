import java.util.*;
// import java.lang;
class Converter{
    public static String TITLEcase(String sentence){
        if (sentence==null ||sentence.isEmpty())
        return sentence;

        String [] words = sentence.split(" ");
    StringBuilder title=new StringBuilder();  //  faster for large or frequent string manipulations
    for(String word : words){
        if(! word.isEmpty()){
            title.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
    } 
        return title.toString().trim();
    }
    
}

class TitleCase{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String titleC = Converter.TITLEcase(sentence);
        System.out.print("Title Name: "+titleC);

    }
}