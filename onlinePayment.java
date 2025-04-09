import java.util.*;
import java.lang.*;

abstract class Payment{
    abstract boolean validatePaymentDetails();
    abstract void processPayment(double amount);
    void generateReceipt(){
        System.out.print("Receipt generates for the payment");

    }
}
class CreditCardPayment extends Payment{
    String cardNumber;
    double rate;
    double RemainingAmount;
    CreditCardPayment(String card, double r, double Ramt){
        this.cardNumber=card;
        this.rate=r;
        this.RemainingAmount=Ramt;
    }
    boolean validatePaymentDetails(){
        if(cardNumber.length()==16 && cardNumber.matches("\\d+")){
            System.out.println("Processing Credit card Payment......");
            return true;
        }
        else{
            System.out.print("Please enter valid card number!!!\n So Could not be processed.");
            return false;
        }
    }
    void processPayment(double amount){
        RemainingAmount=amount-(amount*rate)/100;
        System.out.println("Processed by the credit card amount: "+"₹"+amount);
        System.out.println("Deducted amount after Processing charge by the credit card amount: "+"₹"+RemainingAmount);
    }
    void generateReceipt()
    {
        System.out.println("Receipt Generated for Payment with Credit Card.");
    }

    
}
class PayPalPayment extends Payment{
    String email;
    double rate;
    double RemainingAmount;
    PayPalPayment(String em, double r, double Ramt){
        this.email=em;
        this.rate=r;
        this.RemainingAmount=Ramt;
    }
    boolean validatePaymentDetails(){
        if(email!=null && email.contains("@")){
            System.out.println("Processing PayPal Payments...");
            return true;
        }
        else{
            System.out.print("Invalid Email  !!!!!");
            return false;
        }
    }
    void processPayment(double amount){
        RemainingAmount=amount-(amount*rate)/100;
        System.out.println("Processed by the PayPal: "+"₹"+amount);
        System.out.println("Deducted amount after Processing charge by the credit card amount: "+"₹"+RemainingAmount);

    }
     void generateReceipt()
    {
        System.out.println("Receipt Generated for Payment with Credit Card.");
    }

}
class onlinePayment{
    public static void main(String []a){
        Scanner sc = new Scanner (System.in);
        
        int choice;
        Payment ref=null;
        double amount;
        double rate;
        System.out.println("press 1: Credit Card");
        System.out.println("press 2: Pay Pal");
        System.out.println("press 3: Exit from this interface");
        System.out.println("Enter the choice:");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter  the card Number: ");
                String card=sc.next();
                System.out.print("Enter processing charge percentage for Credit Card: ");
                rate = sc.nextDouble();
                ref=new CreditCardPayment(card,rate,0);
                break;

            case 2:
                System.out.print("Enter your Email: ");
                String email=sc.next();
                System.out.print("Enter processing charge percentage by PayPal: ");
                rate = sc.nextDouble();
                ref=new PayPalPayment(email,rate,0);
                break;
            case 3:
                System.out.println("Exit from this interface....... Thank you!");
                
                System.exit(0);  // Forcefully exit
                break;

            
            default:
                System.out.print("Enter valid number\n\n *****Thank You*****");
        }
        if(ref.validatePaymentDetails()){
            System.out.print("Enter your Amount: "+"₹");
            amount=sc.nextDouble();
            ref.processPayment(amount);
            ref.generateReceipt();
        }

        
    }
}