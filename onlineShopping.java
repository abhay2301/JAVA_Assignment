import java.util.*;

class Product{
    String productName;
    double Price;
    Product(String pm, double price){
        this.productName=pm;
        this.Price=price;
    }
    void displayDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price of the Product: %"+ Price);
    }
}
class Electronics extends Product{
    String Warranty;
    Electronics(String pm, double price,String warP){
        super(pm, price);
        this.Warranty=warP;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Period: "+Warranty+" year");
    }
}
class smartPhone extends Electronics{
    String batteryLife;
    smartPhone(String pm, double price, String warP, String bL){
        super(pm,price, warP);
        this.batteryLife=bL;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Battery Life of a Phone: "+batteryLife+" hours");
    }
}
class onlineShopping{
    public static void main(String []a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Product Name: ");
        String name=sc.nextLine();
        System.out.print("Enter the Product Price: $");
        double price=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the Product Warranty: ");
        String warranty=sc.nextLine();
        System.out.print("Enter the Product Battery Life: ");
        String life=sc.nextLine();
        Product p;
        smartPhone sp=new smartPhone(name, price, warranty,life);
        sp.displayDetails();
    }
}