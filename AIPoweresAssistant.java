interface Speaker{
    void speak(String text);
}
interface Translator{
    void translate(String text, String language);
}
class AIAssistant implements Speaker,Translator{
    public void speak(String text){
        System.out.println("AI speaking: "+ text);
    }
    public void translate(String text, String language){
        System.out.println("Translate in "+ language +":"+ text);
    }
}

class AIPoweresAssistant{
    public static void main(String[] args){
        AIAssistant AI=new AIAssistant();
        AI.translate("Hello","French");
    }
}