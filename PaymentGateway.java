import java.util.*;

interface UPIPayment{
    void payViaUPI(String upiId, double amount);

}
interface CardPayment{
    void payViaCard(String cardNumber, String cvv, double amount);

}

class OnlinePayment implements UPIPayment,CardPayment{
    public void payViaUPI(String upiId, double amount){
        System.out.println("Processing amount by UPI: "+ amount +"upiId: "+upiId);
        System.out.println("Upi payment Successful!...");
    }
    public void payViaCard(String cardNumber,String cvv, double amount){
        System.out.println("Processing amount by Card: "+amount +"card ending with "+cardNumber.substring(cardNumber.length()-4));    
        System.out.println("Payment Successful by card!.....");
    }

}

class PaymentGateway{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        OnlinePayment pay=new OnlinePayment();
        System.out.print("Enter upiId: ");
        String id=sc.nextLine();
        System.out.print("Enter Amount: ");
        double amt=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Card Number: ");
        String cNumber=sc.nextLine();
        System.out.print("Enter CVV: ");
        String cvv=sc.nextLine();
        pay.payViaUPI(id,amt);
        pay.payViaCard(cNumber, cvv, amt);
    }
}
